package org.chamomile.ios.webkit;

import org.chamomile.ios.foundation.NSObject;

/**
 * A {@code WKNavigationAction} object contains information about an action that
 * may cause a navigation, used for making policy decisions.
 * 
 * @author ggeorg
 */
public final class WKNavigationAction extends NSObject implements WKNavigationActionPolicy {

	public static WKNavigationAction wrap(Object nativeObj) {
		if (nativeObj != null) {
			final WKNavigationAction wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new WKNavigationAction(nativeObj);
		}
		return null;
	}

	private WKNavigationAction(Object nativeObj) {
		setNativeObj(nativeObj);
	}
}