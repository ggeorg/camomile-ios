package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;
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

	public UIWindow() {
		super(createNativeObj());
	}

	public UIWindow(CGRect frame) {
		super(createNativeObj(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height));
	}

	public UIWindow(float x, float y, float width, float height) {
		super(createNativeObj(x, y, width, height));
	}

	private static native Object createNativeObj() /*-[
	//@formatter:off
		return [[UIWindow alloc] init];
	//@formatter:on
	]-*/;

	private static native Object createNativeObj(float x, float y, float width, float height) /*-[
	//@formatter:off
		return [[UIWindow alloc] initWithFrame:CGRectMake(x, y, width, height)];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Configuring the Window
	// ---------------------------------------------------------------------

	public UIViewController getRootViewController() {
		return UIViewController.wrap(getRootViewControllerImpl());
	}

	private native Object getRootViewControllerImpl() /*-[
	//@formatter:off
		UIWindow *_self = [self getNativeObj];
		return _self.rootViewController;
	//@formatter:on
	]-*/;

	public native void setRootViewController(UIViewController rootViewController) /*-[
	//@formatter:off
		UIWindow *_self = [self getNativeObj];
		UIViewController *_rootViewController = [rootViewController getNativeObj];
		_self.rootViewController = _rootViewController;
	//@formatter:on
	]-*/;

	// TODO windowLevel

	// TODO screen

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
