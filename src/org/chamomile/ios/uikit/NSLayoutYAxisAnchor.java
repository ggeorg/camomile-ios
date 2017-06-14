package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

public final class NSLayoutYAxisAnchor extends NSObject {
	
	public static final NSLayoutYAxisAnchor wrap(Object nativeObj) {
		if (nativeObj != null) {
			final NSLayoutYAxisAnchor wrapper = NSObject.nativeToJava(nativeObj);
			return wrapper != null ? wrapper : new NSLayoutYAxisAnchor(nativeObj);
		}
		return null;
	}

	private NSLayoutYAxisAnchor(Object nativeObj) {
		setNativeObj(nativeObj);
	}

}
