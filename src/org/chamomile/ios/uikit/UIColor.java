package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/*-[
 #import <UIKit/UIKit.h>
 ]-*/

/**
 * An object that stores color data and opacity (alpha value).
 * 
 * @author ggeorg
 */
public class UIColor extends NSObject {
	
	public static final UIColor wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UIColor wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UIColor(nativeObj);
		}
		return null;
	}

	protected UIColor(Object nativeObj) {
		setNativeObj(nativeObj);
	}

	public UIColor(float red, float green, float blue, float alpha) {
		setNativeObj(createNativeObj(red, green, blue, alpha));
	}

	private native Object createNativeObj(float red, float green, float blue, float alpha) /*-[
	//@formatter:off
		return [[UIColor alloc] initWithRed:red green:green blue:blue alpha:alpha];
	//@formatter:on
	]-*/;
}
