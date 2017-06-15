package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/*-[
 #import <UIKit/UIKit.h>
 ]-*/

/**
 * A view that displays one or more lines of read-only text, often used in
 * conjunction with controls to describe their indented purpose.
 * 
 * @author ggeorg
 */
public class UILabel extends UIView {

	public static final UILabel wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UILabel wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UILabel(nativeObj);
		}
		return null;
	}

	protected UILabel(Object nativeObj) {
		super(nativeObj);
	}

	public UILabel() {
		super(createNativeObj());
	}

	public UILabel(String text) {
		this();
		setText(text);
	}

	//@formatter:off
	private static native Object createNativeObj() /*-[
		UILabel *label = [[UILabel alloc] initWithFrame:CGRectMake(10, 70, 50, 50)];
		[label setBackgroundColor:[UIColor clearColor]];//Set background color of label.
		[label setTextColor:[UIColor blackColor]];//Set text color in label.
		[label setText:@"Label"];//Set text in label.
		return label;
	]-*/;
	//@formatter:on

	//@formatter:off
	public native void setText(String text) /*-[
		UILabel *label = [self getNativeObj];
		[label setText:text];//Set text in label.
	]-*/;
	//@formatter:on
}
