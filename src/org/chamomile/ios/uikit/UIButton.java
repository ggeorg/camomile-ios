package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

public class UIButton extends UIControl {

	public static final UIButton wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UIButton wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UIButton(nativeObj);
		}
		return null;
	}

	protected UIButton(Object nativeObj) {
		super(nativeObj);
	}

	public UIButton() {
		super(createButton());
	}

	//@formatter:off
	private static native Object createButton() /*-[
		UIButton *button = [UIButton buttonWithType:UIButtonTypeRoundedRect];
		[button setFrame:CGRectMake(52, 252, 215, 40)];
		[button setTitle:@"Show View" forState:UIControlStateNormal];
		return button;
	]-*/;
	//@formatter:on

}
