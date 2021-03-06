package net.jeeeyul.pdetools.shell;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Map;

import net.jeeeyul.pdetools.Debug;
import net.jeeeyul.pdetools.shared.LaunchCommand;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.menus.UIElement;

public abstract class AbstractFileBasedExecHandler extends AbstractHandler implements IElementUpdater {

	@Override
	public final Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		IResource resource = (IResource) Platform.getAdapterManager().getAdapter(selection.getFirstElement(),
				IResource.class);

		URI uri = resource.getLocationURI();
		if (resource.isLinked()) {
			uri = resource.getRawLocationURI();
		}

		try {
			File file = EFS.getStore(uri).toLocalFile(0, new NullProgressMonitor());
			LaunchCommand command = createLaunchCommand(file);
			Debug.println(command);
			command.execute();
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public abstract LaunchCommand createLaunchCommand(File targetFile);

	@Override
	public final void updateElement(UIElement element, @SuppressWarnings("rawtypes") Map parameters) {
		String label = getLabel();
		if (label != null) {
			element.setText(label);
		}

		ImageDescriptor iconDescriptor = getImageDescriptor();
		if (iconDescriptor != null) {
			element.setIcon(iconDescriptor);
		}
	}
	protected File ensureDirectory(File file){
		if(file.isDirectory()){
			return file;
		}else{
			return file.getParentFile();
		}
	}
	
	protected String getLabel(){
		return null;
	};

	protected ImageDescriptor getImageDescriptor() {
		return null;
	}

}