package com.cohesionforce.avro.gen.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.ui.PlatformUI;

public class GenerateFromGenModelDIHandler extends AbstractHandler {

	GenerateFromGenModelHandler handler;
	
	public GenerateFromGenModelDIHandler() {
		 IEclipseContext context = getActiveContext();
		 handler = ContextInjectionFactory.make(GenerateFromGenModelHandler.class, context);
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		 return ContextInjectionFactory.invoke(handler, Execute.class,
				 getActiveContext());
	}
	
	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		boolean rvalue = false;
		Object object =  ContextInjectionFactory.invoke(handler, CanExecute.class,
				 getActiveContext());
		if(object instanceof Boolean) {
			Boolean bool = (Boolean)object;
			rvalue = bool.booleanValue();
		}
		return rvalue;
	}

	private static IEclipseContext getActiveContext() {
		 IEclipseContext parentContext = (IEclipseContext) PlatformUI.getWorkbench().getService(
		 IEclipseContext.class);
		 return parentContext.getActiveLeaf();
	}
	
}
