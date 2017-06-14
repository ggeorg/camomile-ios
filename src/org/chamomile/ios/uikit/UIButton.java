package org.chamomile.ios.uikit;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

public class UIButton extends UIControl {

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
