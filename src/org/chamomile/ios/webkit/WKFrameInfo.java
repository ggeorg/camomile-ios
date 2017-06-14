package org.chamomile.ios.webkit;

import org.chamomile.ios.foundation.NSObject;
import org.chamomile.ios.foundation.NSURLRequest;

/*-[
#import <WebKit/WebKit.h>
 ]-*/

/**
 * A {@code WKFrameInfo} object contains information about a frame on a webpage.
 * 
 * @author ggeorg
 */
public final class WKFrameInfo extends NSObject implements WKNavigationActionPolicy {

	public static WKFrameInfo wrap(Object nativeObj) {
		if (nativeObj != null) {
			final WKFrameInfo wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new WKFrameInfo(nativeObj);
		}
		return null;
	}

	private WKFrameInfo(Object nativeObj) {
		setNativeObj(nativeObj);
	}

	// ---------------------------------------------------------------------
	// Inspecting Frame Information
	// ---------------------------------------------------------------------

	public native boolean isMainFrame() /*-[
	//@formatter:off
		WKFrameInfo *_self = [self getNativeObj];
		return _self.mainFrame;
	//@formatter:on
	]-*/;

	public NSURLRequest getRequest() {
		return NSURLRequest.wrap(getRequestImpl());
	}

	private native Object getRequestImpl() /*-[
	//@formatter:off
		WKFrameInfo *_self = [self getNativeObj];
		return _self.request;
	//@formatter:on
	]-*/;
	
	public WKSecurityOrigin getSecurityOrigin() {
		return WKSecurityOrigin.wrap(SecurityOriginImpl());
	}

	private native Object SecurityOriginImpl() /*-[
	//@formatter:off
		WKFrameInfo *_self = [self getNativeObj];
		return _self.securityOrigin;
	//@formatter:on
	]-*/;
}
