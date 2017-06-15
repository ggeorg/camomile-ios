package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * A control that offers a binary choice, such as On/Off.
 * 
 * @author ggeorg
 */
public class UISwitch extends UIControl {

	public static final UISwitch wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UISwitch wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UISwitch(nativeObj);
		}
		return null;
	}

	protected UISwitch(Object nativeObj) {
		super(nativeObj);
	}

	public UISwitch() {
		super(createNativeObj());
	}

	public UISwitch(CGRect frame) {
		super(createNativeObj(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height));
	}

	public UISwitch(float x, float y, float width, float height) {
		super(createNativeObj(x, y, width, height));
	}

	private static native Object createNativeObj() /*-[
	//@formatter:off
		return [[UISwitch alloc] init];
	//@formatter:on
	]-*/;

	private static native Object createNativeObj(float x, float y, float width, float height) /*-[
	//@formatter:off
		return [[UISwitch alloc] initWithFrame:CGRectMake(x, y, width, height)];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Setting the Off/On State
	// ---------------------------------------------------------------------

	public native boolean isOn() /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		return _self.on;
	//@formatter:on
	]-*/;

	public native void setOn(boolean on) /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		_self.on = on;
	//@formatter:on
	]-*/;

	public native void setOn(boolean on, boolean animated) /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		[_self setOn:on animated:animated];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Customizing the Appearance of the Switch
	// ---------------------------------------------------------------------

	public UIColor getOnTintColor() {
		return UIColor.wrap(getOnTintColorImpl());
	}

	private native Object getOnTintColorImpl() /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		return _self.onTintColor;
	//@formatter:on
	]-*/;

	public native void setOnTintColor(UIColor onTintColor) /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		UIColor *_onTintColor = [onTintColor getNativeObj];
		_self.onTintColor = _onTintColor;
	//@formatter:on
	]-*/;

	public UIColor getTintColor() {
		return UIColor.wrap(getTintColorImpl());
	}

	private native Object getTintColorImpl() /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		return _self.tintColor;
	//@formatter:on
	]-*/;

	public native void setTintColor(UIColor tintColor) /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		UIColor *_tintColor = [tintColor getNativeObj];
		_self.tintColor = _tintColor;
	//@formatter:on
	]-*/;

	public UIColor getThumbTintColor() {
		return UIColor.wrap(getThumbTintColorImpl());
	}

	private native Object getThumbTintColorImpl() /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		return _self.thumbTintColor;
	//@formatter:on
	]-*/;

	public native void setThumbTintColor(UIColor thumbTintColor) /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		UIColor *_thumbTintColor = [thumbTintColor getNativeObj];
		_self.thumbTintColor = _thumbTintColor;
	//@formatter:on
	]-*/;

	public UIImage getOnImage() {
		return UIImage.wrap(getOnImageImpl());
	}

	private native Object getOnImageImpl() /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		return _self.onImage;
	//@formatter:on
	]-*/;

	public native void setOnImage(UIImage onImage) /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		UIImage *_onImage = [onImage getNativeObj];
		_self.onImage = _onImage;
	//@formatter:on
	]-*/;

	public UIImage getOffImage() {
		return UIImage.wrap(getOffImageImpl());
	}

	private native Object getOffImageImpl() /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		return _self.offImage;
	//@formatter:on
	]-*/;

	public native void setOffImage(UIImage offImage) /*-[
	//@formatter:off
		UISwitch *_self = [self getNativeObj];
		UIImage *_offImage = [offImage getNativeObj];
		_self.offImage = _offImage;
	//@formatter:on
	]-*/;
}
