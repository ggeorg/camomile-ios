package org.chamomile.ios.webkit;

import org.chamomile.ios.foundation.NSObject;

/**
 * A {@code WKNavigationResponse} object contains information about a navigation
 * response, used for making policy decisions.
 * 
 * @author ggeorg
 */
public final class WKNavigationResponse extends NSObject implements WKNavigationResponsePolicy {

	public static WKNavigationResponse wrap(Object nativeObj) {
		if (nativeObj != null) {
			final WKNavigationResponse wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new WKNavigationResponse(nativeObj);
		}
		return null;
	}

	private WKNavigationResponse(Object nativeObj) {
		setNativeObj(nativeObj);
	}
}