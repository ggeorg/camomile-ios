package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/**
 * The relationship between two user interface objects that must be satisfied by
 * the constraint-based layout system.
 * 
 * @author ggeorg
 */
public class NSLayoutConstraint extends NSObject {

	public static NSLayoutConstraint wrap(Object nativeObj) {
		if (nativeObj != null) {
			final NSLayoutConstraint wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new NSLayoutConstraint(nativeObj);
		}
		return null;
	}

	public NSLayoutConstraint(Object nativeObj) {
		setNativeObj(createNativeObj());
	}

	private static Object createNativeObj() {
		// TODO Auto-generated method stub
		return null;
	}

}
