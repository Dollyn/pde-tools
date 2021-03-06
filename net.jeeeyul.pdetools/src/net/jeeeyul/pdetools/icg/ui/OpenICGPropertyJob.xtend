package net.jeeeyul.pdetools.icg.ui

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.ui.dialogs.PreferencesUtil
import org.eclipse.ui.progress.WorkbenchJob

class OpenICGPropertyJob extends WorkbenchJob {
	IProject project
	new(IProject project){
		super("Open ICG Property")
		user = true
		this.project = project
	}

	override runInUIThread(IProgressMonitor monitor) {
		var dialog = PreferencesUtil::createPropertyDialogOn(display.activeShell, project, ICGPropertyPage::ID, null, null);
		dialog.open();
		return Status::OK_STATUS
	}
	
}