package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * A control used to select a single value from a continues range of values.
 * 
 * @author ggeorg
 */
public class UISlider extends UIControl {

	public static UISlider wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UISlider wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UISlider(nativeObj);
		}
		return null;
	}

	protected UISlider(Object nativeObj) {
		super(nativeObj);
	}

	public UISlider() {
		this(createNativeObj());
	}

	public UISlider(CGRect frame) {
		super(createNativeObj(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height));
	}

	public UISlider(float x, float y, float width, float height) {
		super(createNativeObj(x, y, width, height));
	}

	private static native Object createNativeObj() /*-[
	//@formatter:off
		return [[UISlider alloc] init];
	//@formatter:on
	]-*/;

	private static native Object createNativeObj(float x, float y, float width, float height) /*-[
	//@formatter:off
		return [[UISlider alloc] initWithFrame:CGRectMake(x, y, width, height)];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Accessing the Slider’s Value
	// ---------------------------------------------------------------------

	public native float getValue() /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return _self.value;
	//@formatter:on
	]-*/;

	public native void setValue(float value) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		_self.value = value;
	//@formatter:on
	]-*/;

	public native void setValue(float value, boolean animated) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		[_self setValue:value animated:animated];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Accessing the Slider’s Value Limits
	// ---------------------------------------------------------------------

	public native float getMinimumValue() /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return _self.minimumValue;
	//@formatter:on
	]-*/;

	public native void setMinimumValue(float minimumValue) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		_self.minimumValue = minimumValue;
	//@formatter:on
	]-*/;

	public native float getMaximumValue() /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return _self.maximumValue;
	//@formatter:on
	]-*/;

	public native void setMaximumValue(float maximumValue) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		_self.maximumValue = maximumValue;
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Modifying the Slider’s Behavior
	// ---------------------------------------------------------------------

	public native boolean isContinuous() /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return _self.continuous;
	//@formatter:on
	]-*/;

	public native void setContinuous(boolean continuous) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		_self.continuous = continuous;
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Changing the Slider’s Appearance
	// ---------------------------------------------------------------------

	public UIImage getMinimumValueImage() {
		return UIImage.wrap(getMinimumValueImageImpl());
	}

	private native Object getMinimumValueImageImpl() /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return _self.minimumValueImage;
	//@formatter:on
	]-*/;

	public native void setMinimumValueImage(UIImage minimumValueImage) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		UIImage *_minimumValueImage = [minimumValueImage getNativeObj];
		_self.minimumValueImage = _minimumValueImage;
	//@formatter:on
	]-*/;

	public UIImage getMaximumValueImage() {
		return UIImage.wrap(getMaximumValueImageImpl());
	}

	private native Object getMaximumValueImageImpl() /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return _self.maximumValueImage;
	//@formatter:on
	]-*/;

	public native void setMaximumValueImage(UIImage maximumValueImage) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		UIImage *_maximumValueImage = [maximumValueImage getNativeObj];
		_self.maximumValueImage = _maximumValueImage;
	//@formatter:on
	]-*/;

	public UIColor getMinimumTrackTintColor() {
		return UIColor.wrap(getMinimumTrackTintColorImpl());
	}

	private native Object getMinimumTrackTintColorImpl() /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return _self.minimumTrackTintColor;
	//@formatter:on
	]-*/;

	public native void setMinimumTrackTintColor(UIColor minimumTrackTintColor) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		UIColor *_minimumTrackTintColor = [minimumTrackTintColor getNativeObj];
		_self.minimumTrackTintColor = _minimumTrackTintColor;
	//@formatter:on
	]-*/;

	public UIImage getCurrentMinimumTrackImage() {
		return UIImage.wrap(getCurrentMinimumTrackImageImpl());
	}

	private native Object getCurrentMinimumTrackImageImpl() /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return _self.currentMinimumTrackImage;
	//@formatter:on
	]-*/;

	public UIImage getMinimumTrackImageForState(/* UIControlState */int state) {
		return UIImage.wrap(getMinimumTrackImageForStateImpl(state));
	}

	private native Object getMinimumTrackImageForStateImpl(/* UIControlState */int state) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return [_self minimumTrackImageForState:state];
	//@formatter:on
	]-*/;

	public native void setMinimumTrackImage(UIImage image, /* UIControlState */int state) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		UIImage *_image = [image getNativeObj];
		[_self setMinimumTrackImage:_image forState:state];
	//@formatter:on
	]-*/;

	public UIColor getMaximumTrackTintColor() {
		return UIColor.wrap(getMaximumTrackTintColorImpl());
	}

	private native Object getMaximumTrackTintColorImpl() /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return _self.maximumTrackTintColor;
	//@formatter:on
	]-*/;

	public native void setMaximumTrackTintColor(UIColor maximumTrackTintColor) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		UIColor *_maximumTrackTintColor = [maximumTrackTintColor getNativeObj];
		_self.maximumTrackTintColor = _maximumTrackTintColor;
	//@formatter:on
	]-*/;

	public UIImage getCurrentMaximumTrackImage() {
		return UIImage.wrap(getCurrentMaximumTrackImageImpl());
	}

	private native Object getCurrentMaximumTrackImageImpl() /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return _self.currentMaximumTrackImage;
	//@formatter:on
	]-*/;

	public UIImage getMaximumTrackImageForState(/* UIControlState */int state) {
		return UIImage.wrap(getMaximumTrackImageForStateImpl(state));
	}

	private native Object getMaximumTrackImageForStateImpl(/* UIControlState */int state) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return [_self maximumTrackImageForState:state];
	//@formatter:on
	]-*/;

	public native void setMaximumTrackImage(UIImage image, /* UIControlState */int state) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		UIImage *_image = [image getNativeObj];
		[_self setMaximumTrackImage:_image forState:state];
	//@formatter:on
	]-*/;

	public UIColor getThumbTintColor() {
		return UIColor.wrap(getThumbTintColorImpl());
	}

	private native Object getThumbTintColorImpl() /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return _self.thumbTintColor;
	//@formatter:on
	]-*/;

	public native void setThumbTintColor(UIColor thumbTintColor) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		UIColor *_thumbTintColor = [thumbTintColor getNativeObj];
		_self.thumbTintColor = _thumbTintColor;
	//@formatter:on
	]-*/;

	public UIImage getCurrentThumbImage() {
		return UIImage.wrap(getCurrentThumbImageImpl());
	}

	private native Object getCurrentThumbImageImpl() /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return _self.currentThumbImage;
	//@formatter:on
	]-*/;

	public UIImage getThumbImage(/* UIControlState */int state) {
		return UIImage.wrap(getThumbImageImpl(state));
	}

	private native Object getThumbImageImpl(/* UIControlState */int state) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		return [_self thumbImage:state];
	//@formatter:on
	]-*/;

	public native void setThumbImage(UIImage image, /* UIControlState */int state) /*-[
	//@formatter:off
		UISlider *_self = [self getNativeObj];
		UIImage *_image = [image getNativeObj];
		[_self setThumbImage:_image forState:state];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// TODO Overrides for Subclasses
	// ---------------------------------------------------------------------
}
