package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * A control used to increment or decrement a value.
 * 
 * @author ggeorg
 */
public class UIStepper extends UIControl {

	public static final UIStepper wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UIStepper wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UIStepper(nativeObj);
		}
		return null;
	}

	protected UIStepper(Object nativeObj) {
		super(nativeObj);
	}

	public UIStepper() {
		super(createNativeObj());
	}

	public UIStepper(CGRect frame) {
		super(createNativeObj(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height));
	}

	public UIStepper(float x, float y, float width, float height) {
		super(createNativeObj(x, y, width, height));
	}

	private static native Object createNativeObj() /*-[
	//@formatter:off
		return [[UIStepper alloc] init];
	//@formatter:on
	]-*/;

	private static native Object createNativeObj(float x, float y, float width, float height) /*-[
	//@formatter:off
		return [[UIStepper alloc] initWithFrame:CGRectMake(x, y, width, height)];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Configuring the Stepper
	// ---------------------------------------------------------------------

	public native boolean isContinuous() /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		return _self.continuous;
	//@formatter:on
	]-*/;

	public native void setContinuous(boolean continuous) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		_self.continuous = continuous;
	//@formatter:on
	]-*/;

	public native boolean isAutorepeat() /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		return _self.autorepeat;
	//@formatter:on
	]-*/;

	public native void setAutorepeat(boolean autorepeat) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		_self.autorepeat = autorepeat;
	//@formatter:on
	]-*/;

	public native boolean isWraps() /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		return _self.wraps;
	//@formatter:on
	]-*/;

	public native void setWraps(boolean wraps) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		_self.wraps = wraps;
	//@formatter:on
	]-*/;

	public native double getMinimumValue() /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		return _self.minimumValue;
	//@formatter:on
	]-*/;

	public native void setMinimumValue(double minimumValue) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		_self.minimumValue = minimumValue;
	//@formatter:on
	]-*/;

	public native double getMaximumValue() /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		return _self.maximumValue;
	//@formatter:on
	]-*/;

	public native void setMaximumValue(double maximumValue) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		_self.maximumValue = maximumValue;
	//@formatter:on
	]-*/;

	public native double getStepValue() /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		return _self.stepValue;
	//@formatter:on
	]-*/;

	public native void setStepValue(double stepValue) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		_self.stepValue = stepValue;
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Accessing the Stepper’s Value
	// ---------------------------------------------------------------------

	public native double getValue() /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		return _self.value;
	//@formatter:on
	]-*/;

	public native void setValue(double value) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		_self.value = value;
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Customizing Appearance
	// ---------------------------------------------------------------------

	// tintColor: see UIView

	public UIImage getBackgroundImage(/* UIControlState */int state) {
		return UIImage.wrap(getBackgroundImageImpl(state));
	}

	private native Object getBackgroundImageImpl(int state) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		return [_self backgroundImageForState:state];
	//@formatter:on
	]-*/;

	public native void setBackgroundImage(UIImage image, /* UIControlState */int state) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		UIImage *_image = [image getNativeObj];
		[_self setBackgroundImage:_image forState:state];
	//@formatter:on
	]-*/;

	public UIImage getDecrementImage(/* UIControlState */int state) {
		return UIImage.wrap(getDecrementImageImpl(state));
	}

	private native Object getDecrementImageImpl(int state) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		return [_self decrementImageForState:state];
	//@formatter:on
	]-*/;

	public native void setDecrementImage(UIImage image, /* UIControlState */int state) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		UIImage *_image = [image getNativeObj];
		[_self setDecrementImage:_image forState:state];
	//@formatter:on
	]-*/;

	public UIImage getDividerImage(/* UIControlState */int leftSegmentState,
			/* UIControlState */int rightSegmentState) {
		return UIImage.wrap(getDividerImageImpl(leftSegmentState, rightSegmentState));
	}

	private native Object getDividerImageImpl(int leftSegmentState, int rightSegmentState) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		return [_self dividerImageForLeftSegmentState:leftSegmentState rightSegmentState:rightSegmentState];
	//@formatter:on
	]-*/;

	public native void setDividerImage(UIImage image, /* UIControlState */int leftSegmentState,
			/* UIControlState */int rightSegmentState) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		UIImage *_image = [image getNativeObj];
        [_self setDividerImage:_image forLeftSegmentState:leftSegmentState rightSegmentState:rightSegmentState];
	//@formatter:on
	]-*/;

	public UIImage getIncrementImage(/* UIControlState */int state) {
		return UIImage.wrap(getDecrementImageImpl(state));
	}

	private native Object getIncrementImageImpl(int state) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		return [_self incrementImageForState:state];
	//@formatter:on
	]-*/;

	public native void setIncrementImage(UIImage image, /* UIControlState */int state) /*-[
	//@formatter:off
		UIStepper *_self = [self getNativeObj];
		UIImage *_image = [image getNativeObj];
		[_self setIncrementImage:_image forState:state];
	//@formatter:on
	]-*/;
}
