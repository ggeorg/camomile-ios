package org.chamomile.ios.uikit;

/*-[
 #import <UIKit/UIKit.h>
 ]-*/

/**
 * The base class for controls, which are visual elements that convey a specific
 * action or intention in response to user interactions.
 * 
 * @author ggeorg
 */
public abstract class UIControl extends UIView
		implements UIControlEvents, UIControlState {
	
	protected UIControl(Object nativeObj) {
		super(nativeObj);
	}

	//@formatter:off
	public native void addTarget(UIEventHandler handler, int controlEvents) /*-[
		// XXX: the control does not retain the object in the target parameter.
		[[self getNativeObj] addTarget:handler action:@selector(onEvent:event:)
			          forControlEvents:controlEvents];
	]-*/;
	//@formatter:on

	//@formatter:off
	public native void removeTarget(UIEventHandler handler, int controlEvents) /*-[
		[[self getNativeObj] removeTarget:handler action:@selector(onEvent:event:)
			          forControlEvents:controlEvents];
	]-*/;
	//@formatter:on
}
