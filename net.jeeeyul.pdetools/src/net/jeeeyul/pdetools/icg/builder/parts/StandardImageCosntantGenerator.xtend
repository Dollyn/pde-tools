package net.jeeeyul.pdetools.icg.builder.parts

import net.jeeeyul.pdetools.icg.builder.model.ICGConfiguration
import net.jeeeyul.pdetools.model.pdetools.ImageFile
import net.jeeeyul.pdetools.model.pdetools.Palette
import org.eclipse.xtend.lib.Property

class StandardImageCosntantGenerator implements IConstantGenerator {
	@Property
	ICGConfiguration config ;
	
	val ImagePreviewGenerator previewGenerator = new ImagePreviewGenerator()

	override String generateJavaSource(Palette rootPalette) '''
		// Copyright 2012 Jeeeyul Lee, Seoul, Korea
		// https://github.com/jeeeyul/pde-tools
		//
		// This module is multi-licensed and may be used under the terms
		// of any of the following licenses:
		//
		// EPL, Eclipse Public License, V1.0 or later, http://www.eclipse.org/legal
		// LGPL, GNU Lesser General Public License, V2.1 or later, http://www.gnu.org/licenses/lgpl.html
		// GPL, GNU General Public License, V2 or later, http://www.gnu.org/licenses/gpl.html
		// AL, Apache License, V2.0 or later, http://www.apache.org/licenses
		// BSD, BSD License, http://www.opensource.org/licenses/bsd-license.php
		// MIT, MIT License, http://www.opensource.org/licenses/MIT
		//
		// Please contact the author if you need another license.
		// This module is provided "as is", without warranties of any kind.
		package «config.generatePackageName»;
		
		import java.io.File;
		import java.net.URL;
		
		import org.eclipse.core.runtime.Platform;
		import org.eclipse.jface.resource.ImageDescriptor;
		import org.eclipse.jface.resource.ImageRegistry;
		import org.eclipse.swt.graphics.Image;
		import org.eclipse.swt.widgets.Display;
		import org.eclipse.ui.ISharedImages;
		import org.eclipse.ui.PlatformUI;
		import org.osgi.framework.Bundle;
		
		/*
		 * Generated by PDE Tools.
		 */
		public class « config.generateClassName »{
			« FOR eachPalette : rootPalette.subPalettes SEPARATOR lineSeparator»
				« eachPalette.generateSubPalette »
			« ENDFOR »
			
			« FOR eachFile : rootPalette.imageFiles SEPARATOR lineSeparator »
				« eachFile.generateField() »
			« ENDFOR »
			private static final ImageRegistry REGISTRY = new ImageRegistry(Display.getDefault());
			
			public static Image getImage(String key){
				Image result = REGISTRY.get(key);
				if(result == null){
					result = loadImage(key);
					REGISTRY.put(key, result);
				}
				return result;
			}
			
			public static ImageDescriptor getImageDescriptor(String key){
				ImageDescriptor result = REGISTRY.getDescriptor(key);
				if(result == null){
					result = loadImageDescriptor(key);
					REGISTRY.put(key, result);
				}
				return result;
			}
			
			private static Image loadImage(String key) {
				try {
					Bundle bundle = Platform.getBundle("«config.bundleId»");
					URL resource = null;
					
					if(bundle != null){
						resource = Platform.getBundle("«config.bundleId»").getResource(key);
					}else{
						resource = new File(key).toURI().toURL();	
					}
					
					Image image = new Image(null, resource.openStream());
					return image;
				} catch (Exception e) {
					e.printStackTrace();
					return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
				}
			}
			
			private static ImageDescriptor loadImageDescriptor(String key) {
				try {
					Bundle bundle = Platform.getBundle("«config.bundleId»");
					URL resource = null;
					
					if(bundle != null){
						resource = Platform.getBundle("«config.bundleId»").getResource(key);
					}else{
						resource = new File(key).toURI().toURL();	
					}
					
					ImageDescriptor descriptor = ImageDescriptor.createFromURL(resource);
					return descriptor;
				} catch (Exception e) {
					e.printStackTrace();
					return PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJS_ERROR_TSK);
				}
			}
		}
	'''

	def private String generateSubPalette(Palette palette) '''
		/**
		 * Constants set for folder '«palette.folder.projectRelativePath.toPortableString»'
		 */
		public static interface « palette.fieldName »{
			« FOR eachSub : palette.subPalettes SEPARATOR lineSeparator»
				«eachSub.generateSubPalette()»
			« ENDFOR»
			« FOR eachFile : palette.imageFiles SEPARATOR lineSeparator»
				« eachFile.generateField() »
			« ENDFOR »
		}
	'''

	def private generateField(ImageFile file) '''
		/**
		«IF config.generateImagePreview»
		 	«' '»* «previewGenerator.generate(file.file)»
		«ENDIF»
		 * Image constant for «file.file.projectRelativePath.toPortableString»
		 */
		public static final String « file.fieldName » = "« file.file.projectRelativePath.toPortableString »";
	'''
	
	def private lineSeparator(){
		System::getProperty("line.separator") 
	}
	
}