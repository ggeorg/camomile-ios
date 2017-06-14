package org.chamomile.ios.foundation;

/*-[
#import <Foundation/Foundation.h>
 ]-*/

/**
 * A URL load request that is independent of protocol or URL scheme.
 * 
 * @author ggeorg
 */
public class NSURLRequest extends NSObject {

	public static final NSURLRequest wrap(Object nativeObj) {
		if (nativeObj != null) {
			final NSURLRequest wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new NSURLRequest(nativeObj);
		}
		return null;
	}

	public NSURLRequest(NSURL url) {
		this(createNativeObj(url));
	}

	protected NSURLRequest(Object nativeObj) {
		setNativeObj(nativeObj);
	}

	private static native Object createNativeObj(NSURL url) /*-[
	//@formatter:off
		NSURL *_url = [url getNativeObj];
		return [NSURLRequest requestWithURL:_url];
	//@formatter:on
	]-*/;

}
