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

	public native void addTarget(UIEventHandler<?> handler, int controlEvents) /*-[
	//@formatter:off
		// XXX: the control does not retain the object in the target parameter.
		[[self getNativeObj] addTarget:handler action:@selector(onEvent:event:)
			          forControlEvents:controlEvents];
	//@formatter:on
	]-*/;

	public native void removeTarget(UIEventHandler<?> handler, int controlEvents) /*-[
	//@formatter:off
		[[self getNativeObj] removeTarget:handler action:@selector(onEvent:event:)
			          forControlEvents:controlEvents];
	//@formatter:on
	]-*/;
}
