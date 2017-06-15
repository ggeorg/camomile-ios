package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * An object that provides the backdrop for your app’s user interface and
 * provides important event-handling behaviors.
 * 
 * @author ggeorg
 */
public final class UIWindow extends UIView {

	public static UIWindow wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UIWindow wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UIWindow(nativeObj);
		}
		return null;
	}

	private UIWindow(Object nativeObj) {
		super(nativeObj);
	}

	// ---------------------------------------------------------------------
	// Configuring the Window
	// ---------------------------------------------------------------------

	
	public native void setRootViewController(UIViewController rootViewController) /*-[
	//@formatter:off
		UIWindow *_self = [self getNativeObj];
		UIViewController *_rootViewController = [rootViewController getNativeObj];
		_self.rootViewController = _rootViewController;
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Making Windows Key
	// ---------------------------------------------------------------------
	
	public native void makeKeyAndVisible() /*-[
	//@formatter:off
		UIWindow *_self = [self getNativeObj];
		[_self makeKeyAndVisible];
	//@formatter:on
	]-*/;

}
