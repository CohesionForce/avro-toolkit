package com.cohesionforce.avro.gen;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;

//import com.google.common.io.ByteStreams;

public class FileGenerator {

	private IProject project;
	private String outputPath;
	private IProgressMonitor monitor;

	public void setProject(IProject project) {
		this.project = project;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	public void setMonitor(IProgressMonitor monitor) {
		this.monitor = monitor;
	}

	public void generateFile(String fileName, CharSequence contents) throws IOException, CoreException {
		if (monitor.isCanceled())
			throw new OperationCanceledException();
		IFile file = getFile(fileName, outputPath, monitor);
		if (file == null)
			return;
			String encoding = file.getCharset(true);
			String contentsAsString = contents.toString();
			ByteArrayInputStream newContent = new ByteArrayInputStream(contentsAsString.getBytes(encoding));
			generateFile(file, newContent, contents);

	}

	protected void generateFile(IFile file, InputStream content, CharSequence traceContent) throws IOException, CoreException {
		if (file == null)
			return;

		if (file.exists()) {
			content.reset();
			file.setContents(content, true, true, monitor);
		} else {
			file.create(content, true, monitor);
		}
	}

	protected IFile getFile(String fileName, String outputName, IProgressMonitor progressMonitor) {
		IContainer container = project.getFolder(new Path(outputName));
		if (container != null) {
			IFile result = container.getFile(new Path(fileName));
			return result;
		}
		return null;
	}

}
