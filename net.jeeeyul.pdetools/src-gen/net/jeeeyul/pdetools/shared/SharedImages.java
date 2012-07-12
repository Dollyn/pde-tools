/*******************************************************************************
 * Copyright (c) 2011, Tomato System and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This file was generated by pde-tools.
 *
 * pde-tools was developed as a part of eXERD by jeeeyul@gmail.com
 *
 * http://code.google.com/p/pde-tools
 * http://eclipse.or.kr
 * http://exerd.com
 * http://tomatosystem.co.kr
 *
 * Contributors:
 *     Tomato System - initial API and implementation
 *******************************************************************************/
 
package net.jeeeyul.pdetools.shared; 

import java.net.URL;
import java.util.HashMap;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
public class SharedImages{
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQANUAADV2VDh6Vzh5Vzt+Wjx+WkCFXkSLYkWMY0WLYkWLY0WMYkqTZ0qTaE+abFCabFShcVWhcVShcFindVWicVyseV+we12seY20U420VJa5VZa5VqDAWKHAWKzHWqzHW63HWq3GWq3HW8XWYMbWYMXVYMbVYMXVYdDbY9riZdrhZeDlZv///wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAACsALAAAAAAQABAAAAZbwJVwSCwaj0hhZVlJDisqVdO5oqRQFupKcpUgJxHI40Q+Pc4PokMkMpHapRG7QWSEQqAOKOT5+BdEBgkKChscGxsKCAcHSAUZGgVaBBgXA1oBlQJaAJ0AWqCgQQA7" align="middle" />
	 * Constant for "icons/add.gif" file.
	 */
	public static final String ADD = "icons/add.gif";

	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAOYAAC0rTzpIZzZGZT9ObAAocgAocTBDZDJEZTdHZTtLZzxLZzBGajFHajJIazJHajVKbDNGZDRGZThObrK7x7jD0CVvviZvvihxvyVwvip0wip0wStzvi10vi51vy92v1BsiFJuij51pkJ4qDRwpDRwozVxpUB3pwdYmApamT2GvDyGuz6Hu0KJvESMvUWNvVKZwPf8/06Yv0+Yv1OawPb8//X8//f9//X9//n+//3//6LEv6TFwKTDvqXHwdPp5dHn49Lp5NHo46jIwMrpv8ztv8vsv8vpv8/xweru5+nt5fj/vf//xv//1f//28PBlsnEmMXBl+3s4vb05ff15+nkz+Xgzenjz/Tw4/Lu4+nhz////////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAFsALAAAAAAQABAAAAeAgFuCg4SFhoeGABRIQSosK1iIFBIPT0ACVRYvQ4ZID00NWqJFATGGP08NTAtOWgY6GFGFKT5aDEsMNqJWG4UsCFpQDkoFWhAKLoUrPDA0SQQTODlCHoVRFUQHWjQ1ET0aUoYyATvGN0cDH4dGMxdZCVQZIIiCVxwtHVP0+/z9/YEAOw==" align="middle" />
	 * Constant for "icons/configure.gif" file.
	 */
	public static final String CONFIGURE = "icons/configure.gif";

	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAPcAAMBSU8FTVLFRU+N8fdWPkdWTl6NiaLpjbMGOldzV3P/+/+Lg5fv6//n4/fj3/1FRU/z8/vr6/G5zkPr7//n6/vj5/Wl0lO3x/NTX4Gp1kfDz+mZ1kmh3lGd2k2h2k2h2kcnU6vr7/W97kWx3i1BuoFRwn1VwnWd3kWh4km96jOXt+vf6/1KG0VFxoFV0omx5jFF2qn+n25CYo1mQ01OAt16Qy1F8r5O55rfU9qS1yXR+itjl9fP4/vD1+1GHw1qSz1qQzFWIwV2RylSCtoy1477FzViTz1OIvluTzG12f8XV5eny++Xu91GFtLbG1XR+h3ORqVxufJequHZ/hoKLkubv9vf7/lySuLbEzdDt/c/s/HeAhdLs+c3u/c7u/c/s+tDt+2h1e3B9g3uIjrzc6c7u+9Ds+M/t+M3t+MPLzc/X2fr+/3iChOj2+X2IiuH6/oCKi36EhP7///H9+19lYWRqZn+FgXqAfJacmLK5soSHfpicjoOGe4qLeYqLe3p5ZY+OeZGPdpWSc6SdZ6WeapuWcJqUcJeScqabZaidZ6ecZqacZ6acaaCXbKeaZaibZqebZ6icaKebaaWabKSZa9mqWL6kg3txZf/69ItwU5iPhv/+/WxeU7i0sbOEaNjT0NJqUeCNf/y/urd8eM1VVMBSUdt5eJBTUpNWVbywsP///////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAKsALAAAAAAQABAAAAj4AFcJHEiwoEBCkCAtGpTIUSRGkh5JUoRIIKUyYMyU0VKGy5kuXr5omSSwERojNZD8EELCRIkWLlQ0EmgIDAgley7hgGGDRpMhTAoJPATmTRROlj7FYHHER5AqggQG+oIp04M/oA5AuTIDyBJAAvt8IVXJU6g5nTRJIXLjgh+BesAgwHMK1Q45bYo4yaGBj8A4WWSQMSBglBwMY6gk6WFH4JYscLAQAFBK1Bo2YcTwmCLwiRYFC/IUCDBAgRo6bhzoEJhCC4RNCVKZSqNKVZ07FEQIfPHFSgUGKyhMiFChQQgrIwRKONGhwwkUFjJ04PDBw4cNBrMTDAgAOw==" align="middle" />
	 * Constant for "icons/image.gif" file.
	 */
	public static final String IMAGE = "icons/image.gif";

	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAPcAAAAAAFNMHlJNIFRUN1NXOVRUOFVXOVVVPlRXP1dZOkFIR0tLQE1RQUtQSVNXRVWGvHGDsHGRunGVvXihzY9SGZ5fHZ5mJ6VsJK1sJK1yK61yL7R/Mrx/MryFMoaDfLCHY8OFNsOLNvjQeIKfvKacobanpYyszZKwyJS215m75LzL06vM58ymkdm+tOjQiPjQgPjYiPDYkPjYkPjgmPjomPjgoPjosPjwyP///wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAP8ALAAAAAAQABAAAAiGAP8JHEiwoMGDCBMaDMEwhMJ/GHDgEJCAgIEBBQwEIAiCBo0YCFacQBFBgokDBDvcWOlAhYcSEB5MYECQg42bC1h8aEFiRIoGBDfUGKpAg9GjSP9lkMFUw4ynUJ+60PDvAgwYGq5q1TpVYAURGl6IHSu2q0AKGkSoXavW7EALcOPKfUi3bkAAOw==" align="middle" />
	 * Constant for "icons/image-folder.gif" file.
	 */
	public static final String IMAGE_FOLDER = "icons/image-folder.gif";

	private static HashMap<String, ImageDescriptor> descMap = new HashMap<String, ImageDescriptor>();
	private static HashMap<String, Image> imageMap = new HashMap<String, Image>();

	public static Image getImage(String key) {
		Image image = imageMap.get(key);
		if (image == null) {
			image = loadImage(key);
			ImageDescriptor descriptor = ImageDescriptor.createFromImage(image);
			descMap.put(key, descriptor);
			imageMap.put(key, image);
		}
		return image;
	}

	public static ImageDescriptor getImageDescriptor(String key) {
		ImageDescriptor descriptor = descMap.get(key);
		if (descriptor == null) {
			Image image = loadImage(key);
			descriptor = ImageDescriptor.createFromImage(image);
			descMap.put(key, descriptor);
			imageMap.put(key, image);
		}
		return descriptor;
	}

	private static Image loadImage(String key) {
		try {
			URL resource = Platform.getBundle("net.jeeeyul.pdetools").getResource(key);
			Image image = new Image(null, resource.openStream());
			return image;
		} catch (Exception e) {
			e.printStackTrace();
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
		}
	}
}