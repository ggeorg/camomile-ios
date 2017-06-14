package org.chamomile.ios.webkit;

import org.chamomile.ios.foundation.NSObject;

/*-[
#import <WebKit/WebKit.h>
 ]-*/

/**
 * An instance of this class is a transient, data-only object; it does not
 * uniquely identify a security origin across multiple delegate method calls.
 * 
 * @author ggeorg
 */
public final class WKSecurityOrigin extends NSObject implements WKNavigationActionPolicy {

	public static WKSecurityOrigin wrap(Object nativeObj) {
		if (nativeObj != null) {
			final WKSecurityOrigin wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new WKSecurityOrigin(nativeObj);
		}
		return null;
	}

	private WKSecurityOrigin(Object nativeObj) {
		setNativeObj(nativeObj);
	}

	// ---------------------------------------------------------------------
	// Inspecting Security Origins
	// ---------------------------------------------------------------------

	public native String getHost() /*-[
	//@formatter:off
		WKSecurityOrigin *_self = [self getNativeObj];
		return _self.host;
	//@formatter:on
	]-*/;

	public native int getPort() /*-[
	//@formatter:off
		WKSecurityOrigin *_self = [self getNativeObj];
		return _self.port;
	//@formatter:on
	]-*/;
	
	public native String getProtocol() /*-[
	//@formatter:off
		WKSecurityOrigin *_self = [self getNativeObj];
		return _self.protocol;
	//@formatter:on
	]-*/;
}
