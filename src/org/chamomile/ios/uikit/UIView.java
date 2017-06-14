package org.chamomile.ios.uikit;

import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.foundation.NSObject;

/*-[
 #import <UIKit/UIKit.h>
 #import "CGRect.h"
 ]-*/

/**
 * An object that represents a rectangular area on the screen and manages the
 * content in that area.
 * 
 * @author ggeorg
 */
public class UIView extends UIResponder implements UIViewAutoresizing, UIViewContentMode {

	public static UIView wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UIView wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UIView(nativeObj);
		}
		return null;
	}

	protected UIView(Object nativeObj) {
		setNativeObj(nativeObj);
	}

	// ---------------------------------------------------------------------
	// Configuring a View’s Visual Appearance.
	// ---------------------------------------------------------------------

	public UIColor getBackgroundColor() {
		return UIColor.wrap(getBackgroundColorImpl());
	}

	private native Object getBackgroundColorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.backgroundColor;
	//@formatter:on
	]-*/;

	public native void setBackgroundColor(UIColor backgroundColor) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.backgroundColor = [backgroundColor getNativeObj];
	//@formatter:on
	]-*/;

	public native boolean isHidden() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.hidden;
	//@formatter:on
	]-*/;

	public native void setHidden(boolean hidden) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.hidden = hidden;
	//@formatter:on
	]-*/;

	public native float getAlpha() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.alpha;
	//@formatter:on
	]-*/;

	public native void setAlpha(float alpha) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.alpha = alpha;
	//@formatter:on
	]-*/;

	public native boolean isOpaque() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.opaque;
	//@formatter:on
	]-*/;

	public native void setOpaque(boolean opaque) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.opaque = opaque;
	//@formatter:on
	]-*/;

	public UIColor getTintColor() {
		return UIColor.wrap(getTintColorImpl());
	}

	private native Object getTintColorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.tintColor;
	//@formatter:on
	]-*/;

	public native void setTintColor(UIColor tintColor) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.tintColor = [tintColor getNativeObj];
	//@formatter:on
	]-*/;

	// TODO tintAdjustmentMode

	public native boolean isClipsToBounds() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.clipsToBounds;
	//@formatter:on
	]-*/;

	public native void setClipsToBounds(boolean clipsToBounds) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.clipsToBounds = clipsToBounds;
	//@formatter:on
	]-*/;

	public native boolean isClearsContextBeforeDrawing() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.clearsContextBeforeDrawing;
	//@formatter:on
	]-*/;

	public native void setClearsContextBeforeDrawing(boolean clearsContextBeforeDrawing) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.clearsContextBeforeDrawing = clearsContextBeforeDrawing;
	//@formatter:on
	]-*/;

	public UIView getMaskView() {
		return wrap(getMaskViewImpl());
	}

	private native Object getMaskViewImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.maskView;
	//@formatter:on
	]-*/;

	public native void setMaskView(UIView maskView) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.maskView = [maskView getNativeObj];
	//@formatter:on
	]-*/;

	// TODO layerClass

	// TODO layer

	// ---------------------------------------------------------------------
	// Configuring the Event-Related Behavior.
	// ---------------------------------------------------------------------

	public native boolean isUserInteractionEnabled() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.userInteractionEnabled;
	//@formatter:on
	]-*/;

	public native void setUserInteractionEnabled(boolean userInteractionEnabled) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.userInteractionEnabled = userInteractionEnabled;
	//@formatter:on
	]-*/;

	public native boolean isMultipleTouchEnabled() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.multipleTouchEnabled;
	//@formatter:on
	]-*/;

	public native void setMultipleTouchEnabled(boolean multipleTouchEnabled) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.multipleTouchEnabled = multipleTouchEnabled;
	//@formatter:on
	]-*/;

	public native boolean isExclusiveTouch() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.exclusiveTouch;
	//@formatter:on
	]-*/;

	public native void setExclusiveTouch(boolean exclusiveTouch) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.exclusiveTouch = exclusiveTouch;
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Configuring the Bounds and Frame Rectangles
	// ---------------------------------------------------------------------

	public native CGRect getFrame() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		float x = _self.frame.origin.x;
		float y = _self.frame.origin.y;
		float width = _self.frame.size.width;
		float height = _self.frame.size.height;
		return [[OrgChamomileIosCoreGraphicsCGRect alloc] x:x y:y width:width height:height];
	//@formatter:on
	]-*/;

	public native void setFrame(float[] frame) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.frame = CGRectMake([frame floatAtIndex:0], [frame floatAtIndex:1], 
			[frame floatAtIndex:2], [frame floatAtIndex:3]);
	//@formatter:on
	]-*/;

	// TODO bounds

	// TODO center

	// TODO transform

	// ---------------------------------------------------------------------
	// Managing the View Hierarchy.
	// ---------------------------------------------------------------------

	public UIView getSuperview() {
		return wrap(getSuperviewImpl());
	}

	private native Object getSuperviewImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.superview;
	//@formatter:on
	]-*/;

	public UIViewArray getSubviews() {
		return UIViewArray.wrap(getSubviewsImpl());
	}

	private native Object getSubviewsImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.subviews;
	//@formatter:on
	]-*/;

	// TODO window

	public native void addSubview(UIView view) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		UIView *_view = [view getNativeObj];
		[_self addSubview:_view];
	//@formatter:on
	]-*/;

	public native void bringSubviewToFront(UIView view) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		UIView *_view = [view getNativeObj];
		[_self bringSubviewToFront:_view];
	//@formatter:on
	]-*/;

	public native void sendSubviewToBack(UIView view) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		UIView *_view = [view getNativeObj];
		[_self sendSubviewToBack:_view];
	//@formatter:on
	]-*/;

	public native void removeFromSuperview() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		[_self removeFromSuperview];
	//@formatter:on
	]-*/;

	public native void insertSubview(UIView view, int index) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		UIView *_view = [view getNativeObj];
		[_self insertSubview:_view atIndex:index];
	//@formatter:on
	]-*/;

	public native void insertAboveSubview(UIView view, UIView siblingSubview) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		UIView *_view = [view getNativeObj];
		UIView *_siblingSubview = [siblingSubview getNativeObj];
		[_self insertSubview:_view aboveSubview:_siblingSubview];
	//@formatter:on
	]-*/;

	public native void insertBelowSubview(UIView view, UIView siblingSubview) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		UIView *_view = [view getNativeObj];
		UIView *_siblingSubview = [siblingSubview getNativeObj];
		[_self insertSubview:_view belowSubview:_siblingSubview];
	//@formatter:on
	]-*/;

	public native void exchangeSubviews(int index1, int index2) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		[_self exchangeSubviewAtIndex:index1 withSubviewAtIndex:index2];
	//@formatter:on
	]-*/;

	public native void isDescendantOfView(UIView view) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		UIView *_view = [view getNativeObj];
		[_self isDescendantOfView:_view];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Configuring the Resizing Behavior.
	// ---------------------------------------------------------------------

	public native int getAutoresizingMask() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.autoresizingMask;
	//@formatter:on
	]-*/;

	public native void setAutoresizingMask(int autoresizingMask) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.autoresizingMask = autoresizingMask;
	//@formatter:on
	]-*/;

	public native boolean isAutoresizesSubviews() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.autoresizesSubviews;
	//@formatter:on
	]-*/;

	public native void setAutoresizesSubviews(boolean autoresizesSubviews) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.autoresizesSubviews = autoresizesSubviews;
	//@formatter:on
	]-*/;

	public native int getContentMode() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.contentMode;
	//@formatter:on
	]-*/;

	public native void setContentMode(int contentMode) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		_self.contentMode = contentMode;
	//@formatter:on
	]-*/;

	// TODO sizeThatFits

	public native void sizeToFit() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		[_self sizeToFit];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Laying out Subviews
	// ---------------------------------------------------------------------

	public native void setNeedsLayout() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		[_self setNeedsLayout];
	//@formatter:on
	]-*/;

	public native void layoutIfNeeded() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		[_self layoutIfNeeded];
	//@formatter:on
	]-*/;

	// TODO requiresConstraintBasedLayout

	public native boolean translatesAutoresizingMaskIntoConstraints() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return [_self translatesAutoresizingMaskIntoConstraints];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Layout Anchors
	// ---------------------------------------------------------------------

	public NSLayoutYAxisAnchor getBottomAnchor() {
		return NSLayoutYAxisAnchor.wrap(getBackgroundColorImpl());
	}

	private native Object getBottomAnchorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.bottomAnchor;
	//@formatter:on
	]-*/;

	public NSLayoutXAxisAnchor getCenterXAnchor() {
		return NSLayoutXAxisAnchor.wrap(getCenterXAnchorImpl());
	}

	private native Object getCenterXAnchorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.centerXAnchor;
	//@formatter:on
	]-*/;

	public NSLayoutYAxisAnchor getCenterYAnchor() {
		return NSLayoutYAxisAnchor.wrap(getCenterYAnchorImpl());
	}

	private native Object getCenterYAnchorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.centerYAnchor;
	//@formatter:on
	]-*/;

	public NSLayoutYAxisAnchor getFirstBaselineAnchor() {
		return NSLayoutYAxisAnchor.wrap(getFirstBaselineAnchorImpl());
	}

	private native Object getFirstBaselineAnchorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.firstBaselineAnchor;
	//@formatter:on
	]-*/;

	public NSLayoutDimension getHeightAnchor() {
		return NSLayoutDimension.wrap(getFirstBaselineAnchorImpl());
	}

	private native Object getHeightAnchorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.heightAnchor;
	//@formatter:on
	]-*/;

	public NSLayoutYAxisAnchor getLastBaselineAnchor() {
		return NSLayoutYAxisAnchor.wrap(getLastBaselineAnchorImpl());
	}

	private native Object getLastBaselineAnchorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.lastBaselineAnchor;
	//@formatter:on
	]-*/;

	public NSLayoutXAxisAnchor getLeadingAnchor() {
		return NSLayoutXAxisAnchor.wrap(getLeadingAnchorImpl());
	}

	private native Object getLeadingAnchorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.leadingAnchor;
	//@formatter:on
	]-*/;

	public NSLayoutXAxisAnchor getLeftAnchor() {
		return NSLayoutXAxisAnchor.wrap(getLeftAnchorImpl());
	}

	private native Object getLeftAnchorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.leftAnchor;
	//@formatter:on
	]-*/;

	public NSLayoutXAxisAnchor getRightAnchor() {
		return NSLayoutXAxisAnchor.wrap(getRightAnchorImpl());
	}

	private native Object getRightAnchorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.rightAnchor;
	//@formatter:on
	]-*/;

	public NSLayoutYAxisAnchor getTtopAnchor() {
		return NSLayoutYAxisAnchor.wrap(getTopAnchorImpl());
	}

	private native Object getTopAnchorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.topAnchor;
	//@formatter:on
	]-*/;

	public NSLayoutXAxisAnchor getTrailingAnchor() {
		return NSLayoutXAxisAnchor.wrap(getTrailingAnchorImpl());
	}

	private native Object getTrailingAnchorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.trailingAnchor;
	//@formatter:on
	]-*/;

	public NSLayoutDimension getWidthAnchor() {
		return NSLayoutDimension.wrap(getWidthAnchorImpl());
	}

	private native Object getWidthAnchorImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.widthAnchor;
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Managing the View’s Constraints
	// ---------------------------------------------------------------------

	// TODO constraints
	public NSLayoutConstraintArray getConstraints() {
		return NSLayoutConstraintArray.wrap(getSubviewsImpl());
	}

	private native Object getConstraintsImpl() /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		return _self.constraints;
	//@formatter:on
	]-*/;

	public native void addConstraint(NSLayoutConstraint constraint) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		NSLayoutConstraint *_constraint = [constraint getNativeObj];
		[_self addConstraint:_constraint];
	//@formatter:on
	]-*/;

	public void addConstraints(NSLayoutConstraint... constraints) {
		for (NSLayoutConstraint constraint : constraints) {
			addConstraint(constraint);
		}
	}

	public native void removeConstraint(NSLayoutConstraint constraint) /*-[
	//@formatter:off
		UIView *_self = [self getNativeObj];
		NSLayoutConstraint *_constraint = [constraint getNativeObj];
		[_self removeConstraint:_constraint];
	//@formatter:on
	]-*/;

	public void removeConstraints(NSLayoutConstraint... constraints) {
		for (NSLayoutConstraint constraint : constraints) {
			removeConstraint(constraint);
		}
	}

	// ---------------------------------------------------------------------
	// Working with Layout Guides
	// ---------------------------------------------------------------------

	// ---------------------------------------------------------------------
	// Measuring in Auto Layout
	// ---------------------------------------------------------------------

	// ---------------------------------------------------------------------
	// Aligning Views in Auto Layout
	// ---------------------------------------------------------------------

	// ---------------------------------------------------------------------
	// Triggering Auto Layout
	// ---------------------------------------------------------------------

	// ---------------------------------------------------------------------
	// Debugging Auto Layout
	// ---------------------------------------------------------------------

	// ---------------------------------------------------------------------
	// Managing the User Interface Direction
	// ---------------------------------------------------------------------

	// ---------------------------------------------------------------------
	// Configuring Content Margins
	// ---------------------------------------------------------------------

	// ---------------------------------------------------------------------
	// Drawing and Updating the View
	// ---------------------------------------------------------------------

}
