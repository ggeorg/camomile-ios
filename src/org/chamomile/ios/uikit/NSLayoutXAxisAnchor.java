package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

public class NSLayoutXAxisAnchor extends NSObject {
	
	public static final NSLayoutXAxisAnchor wrap(Object nativeObj) {
		if (nativeObj != null) {
			final NSLayoutXAxisAnchor wrapper = NSObject.nativeToJava(nativeObj);
			return wrapper != null ? wrapper : new NSLayoutXAxisAnchor(nativeObj);
		}
		return null;
	}

	private NSLayoutXAxisAnchor(Object nativeObj) {
		setNativeObj(nativeObj);
	}

}
