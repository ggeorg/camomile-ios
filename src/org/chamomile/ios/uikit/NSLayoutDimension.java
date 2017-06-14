package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

public class NSLayoutDimension extends NSObject {
	
	public static final NSLayoutDimension wrap(Object nativeObj) {
		if (nativeObj != null) {
			final NSLayoutDimension wrapper = NSObject.nativeToJava(nativeObj);
			return wrapper != null ? wrapper : new NSLayoutDimension(nativeObj);
		}
		return null;
	}

	private NSLayoutDimension(Object nativeObj) {
		setNativeObj(nativeObj);
	}

}
