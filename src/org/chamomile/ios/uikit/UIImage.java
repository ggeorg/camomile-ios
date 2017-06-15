package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * An object that manages image data in your app.
 * 
 * @author ggeorg
 */
public class UIImage extends NSObject {

	public static final UIImage wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UIImage wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UIImage(nativeObj);
		}
		return null;
	}

	protected UIImage(Object nativeObj) {
		setNativeObj(nativeObj);
	}
	
}
