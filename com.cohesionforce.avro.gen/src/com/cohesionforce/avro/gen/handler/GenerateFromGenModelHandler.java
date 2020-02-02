/*******************************************************************************
 * Copyright (c) 2014 Langley Studios
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Langley Studios - initial API and implementation
 *******************************************************************************/
package com.cohesionforce.avro.gen.handler;

import java.io.File;

import javax.inject.Named;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cohesionforce.avro.gen.AvroSchemaGenerator;
import com.cohesionforce.avro.gen.FileGenerator;
import com.cohesionforce.avro.gen.GenerateAvroConverter;
import com.cohesionforce.avro.gen.GenerateResourceFactory;
import com.cohesionforce.avro.gen.Utility;
//import com.google.inject.Provider;

public class GenerateFromGenModelHandler {

	private static final String GENMODEL_EXTENSION = "genmodel";	
	private static final String SCHEMA_EXTENSION = "avsc";
	private IResource selectedResource;

	private Logger logger = LoggerFactory.getLogger(GenerateFromGenModelHandler.class);

	@Execute
	public void execute() {

		// Load the GenModel to get the path to the source plugin
		IProject project = selectedResource.getProject();
		java.net.URI netURI = selectedResource.getLocationURI();
		URI locationURI = URI.createFileURI(netURI.getPath());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(locationURI, true);
		GenModel genModel = (GenModel) resource.getContents().get(0);
		String modelDir = genModel.getModelDirectory();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot workspaceRoot = workspace.getRoot();
		IResource ifile = workspaceRoot.findMember(genModel.getModelPluginID());
		
		IFolder srcGenFolder = project.getFolder("schema");
        if (!srcGenFolder.exists()) {
            try {
                srcGenFolder.create(true, true,
                        new NullProgressMonitor());
            } catch (CoreException e) {
            }
        }
        
        FileGenerator fileGenerator = new FileGenerator();
		fileGenerator.setProject(project);
		fileGenerator.setOutputPath("schema");
		fileGenerator.setMonitor(new NullProgressMonitor()); 
		
		if (ifile != null) {
			java.net.URI fileURI = ifile.getLocationURI();
			File locationFile = new File(fileURI);
			try {
				// configure and start the generator

				AvroSchemaGenerator generator = new AvroSchemaGenerator();
				generator.generateAvroSchema(genModel, fileGenerator);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		try {
			workspaceRoot.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		IResource sourceResource = workspaceRoot.findMember(genModel.getModelDirectory());
		if(sourceResource == null)
		{
			System.err.println("Could not find model directory from genModel");
			return;
		}
		
		if(sourceResource.getLocationURI() == null)
		{
			System.err.println("Could not find location of genModel resource");
		}
		File locationFile = new File(sourceResource.getLocationURI());
		IPath schemaDirPath = ifile.getFullPath().append("schema");
		IResource schemaDirResource = workspaceRoot.findMember(schemaDirPath);

		if (schemaDirResource instanceof IContainer) {
			IContainer container = (IContainer) schemaDirResource;
			try {
				for (IResource schemaRes : container.members()) {
					if (SCHEMA_EXTENSION.equals(schemaRes.getFileExtension())) {

						IResource schemaResource = workspaceRoot
								.findMember(schemaRes.getFullPath().toFile().toString());

						java.net.URI schemaURI = schemaResource.getLocationURI();
						File schemaFile = new File(schemaURI);

						int rvalue = GenerateJavaHandler.generateCode(schemaFile, locationFile);
						if (rvalue != 0) {
							logger.error("Java Generation from schema incomplete: ", schemaFile.getAbsoluteFile());
						}
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		for (GenPackage genPackage : genModel.getGenPackages()) {
			String basePackage = genPackage.getBasePackage() + "." + genPackage.getEcorePackage().getName();
			Utility.setBasePackage(basePackage);
			Utility.setFactory(genPackage.getPrefix() + "Factory");
			Utility.setPackage(genPackage.getPrefix() + "Package");

			String avroDir = "src/" + basePackage.replace('.', '/') + "/avro";
			
			srcGenFolder = project.getFolder(avroDir);
	        if (!srcGenFolder.exists()) {
	            try {
	                srcGenFolder.create(true, true,
	                        new NullProgressMonitor());
	            } catch (CoreException e) {
	            }
	        }

	        fileGenerator.setOutputPath(avroDir);

			GenerateAvroConverter generator;
			generator = new GenerateAvroConverter();
			generator.generateConverter(genPackage.getEcorePackage(), fileGenerator);

			GenerateResourceFactory factoryGenerator;
			factoryGenerator = new GenerateResourceFactory();
			factoryGenerator.generateResourceFactory(genPackage.getEcorePackage(), fileGenerator);
		}

		// Final workspace refresh to make everything visible
		try {
			workspaceRoot.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

	@CanExecute
	public boolean canExecute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structured = (IStructuredSelection) selection;
			Object object = structured.getFirstElement();
			if (object instanceof IResource) {
				IResource resource = (IResource) object;
				if (GENMODEL_EXTENSION.equals(resource.getFileExtension())) {
					selectedResource = resource;
					return true;
				}
			}
		}
		selectedResource = null;
		return false;
	}

}