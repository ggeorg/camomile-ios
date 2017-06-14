package org.chamomile.ios.uikit;

/*-[
#import <UIKit/UIKit.h>
]-*/

public class UITextField extends UIControl {

	public UITextField() {
		super(createNativeObj());
	}

	private static native Object createNativeObj() /*-[
		UITextField *textField = [[UITextField alloc] initWithFrame:CGRectMake(10, 200, 300, 40)];
		textField.borderStyle = UITextBorderStyleRoundedRect;
		textField.placeholder = @"enter text";
		return textField;
	]-*/;
}
