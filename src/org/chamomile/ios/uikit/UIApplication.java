package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * The centralized point of control and coordination for apps running in iOS.
 * 
 * @author ggeorg
 */
public final class UIApplication extends UIResponder {

	public static UIApplication wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UIApplication wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UIApplication(getSharedApplicationImpl());
		}
		return null;
	}
	
	public static UIApplication getSharedApplication() {
		return wrap(getSharedApplicationImpl());
	}
	
	private static native Object getSharedApplicationImpl() /*-[
	//@formatter:off
		return [UIApplication sharedApplication];
	//@formatter:on
	]-*/;

	private UIApplication(Object nativeObj) {
		setNativeObj(nativeObj);
	}

	// ---------------------------------------------------------------------
	// Getting the App Delegate
	// ---------------------------------------------------------------------
}
