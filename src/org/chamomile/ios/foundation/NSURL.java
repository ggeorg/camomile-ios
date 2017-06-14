package org.chamomile.ios.foundation;

/*-[
#import <Foundation/Foundation.h>
 ]-*/

/**
 * An object that represents the location of a resource, such as an item on a
 * remote server or the path to a local file.
 * 
 * @author ggeorg
 */
public class NSURL extends NSObject {

	public static final NSURL wrap(Object nativeObj) {
		if (nativeObj != null) {
			final NSURL wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new NSURL(nativeObj);
		}
		return null;
	}

	protected NSURL(Object nativeObj) {
		setNativeObj(nativeObj);
	}

	public NSURL(String url) {
		setNativeObj(createNativeObj(url)); // XXX BAD ACCESS
	}

	private static native Object createNativeObj(String url) /*-[
	//@formatter:off
		return [NSURL URLWithString:url];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Accessing the Parts of the URL
	// ---------------------------------------------------------------------

	public native String getAbsoluteString() /*-[
	//@formatter:off
		NSURL *_self = [self getNativeObj];
		return _self.absoluteString;
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------

	@Override
	public String toString() {
		return "NSURL [" + getAbsoluteString() + "]";
	}
}
