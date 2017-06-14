package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * An abstract interface for responding to and handling events.
 * 
 * @author ggeorg
 */
public abstract class UIResponder extends NSObject {

	// ---------------------------------------------------------------------
	// Managing the Responder Chain
	// ---------------------------------------------------------------------

	public UIResponder getNextResponder() {
		final Object nativeObj = getNextResponderImpl();
		if (nativeObj != null) {
			final UIResponder result = NSObject.nativeToJava(nativeObj);
			if (result == null) {
				throw new NullPointerException("unknown nativeObj.");
			}
			return result;
		}
		return null;
	}

	private native Object getNextResponderImpl() /*-[
	//@formatter:off
		UIResponder *_self = [self getNativeObj];
		return _self.nextResponder;
	//@formatter:on
	]-*/;

	public native boolean isFirstResponder() /*-[
	//@formatter:off
		UIResponder *_self = [self getNativeObj];
		return _self.isFirstResponder;
	//@formatter:on
	]-*/;

	public native boolean canBecomeFirstResponder() /*-[
	//@formatter:off
		UIResponder *_self = [self getNativeObj];
		return _self.canBecomeFirstResponder;
	//@formatter:on
	]-*/;

	public native boolean becomeFirstResponder() /*-[
	//@formatter:off
		UIResponder *_self = [self getNativeObj];
		return [_self becomeFirstResponder];
	//@formatter:on
	]-*/;

	public native boolean canResignFirstResponder() /*-[
	//@formatter:off
		UIResponder *_self = [self getNativeObj];
		return _self.canResignFirstResponder;
	//@formatter:on
	]-*/;

	public native boolean resignFirstResponder() /*-[
	//@formatter:off
		UIResponder *_self = [self getNativeObj];
		return [_self resignFirstResponder];
	//@formatter:on
	]-*/;
	
	// ---------------------------------------------------------------------
	
	// TODO targetForAction:withSender:
	
	// TODO userActivity
	
}
