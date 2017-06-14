package org.chamomile.ios.webkit;

import org.chamomile.ios.foundation.NSObject;

/**
 * A {@code WKNavigation} object contains information for tracking the loading
 * progress of a webpage.
 * 
 * @author ggeorg
 */
public final class WKNavigation extends NSObject {

	public static WKNavigation wrap(Object nativeObj) {
		if (nativeObj != null) {
			final WKNavigation wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new WKNavigation(nativeObj);
		}
		return null;
	}

	protected WKNavigation(Object nativeObj) {
		setNativeObj(nativeObj);
	}
}
