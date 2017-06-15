package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * An object that defines the properties associated with a hardware-based
 * display.
 * 
 * @author ggeorg
 */
public final class UIScreen extends NSObject {

	public static final UIScreen wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UIScreen wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UIScreen(nativeObj);
		}
		return null;
	}

	private UIScreen(Object nativeObj) {
		setNativeObj(nativeObj);
	}

	public static UIScreen getMainScreen() {
		return wrap(getMainScreenImpl());
	}

	private static native Object getMainScreenImpl() /*-[
	//@formatter:off
		return [UIScreen mainScreen];
	//@formatter:on
	]-*/;

	public native CGRect getBounds() /*-[
	//@formatter:off
		UIScreen *_self = [self getNativeObj];
		CGRect bounds = _self.bounds;
		float x = bounds.origin.x;
		float y = bounds.origin.y;
		float width  = bounds.size.width;
		float height = bounds.size.height;
		return [[OrgChamomileIosCoreGraphicsCGRect alloc] x:x y:y width:width height:height];
	//@formatter:on
	]-*/;

}
