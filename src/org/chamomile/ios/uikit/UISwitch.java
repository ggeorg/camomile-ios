package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * A control that offers a binary choice, such as On/Off.
 * 
 * @author ggeorg
 */
public class UISwitch extends UIControl {

	public static final UISwitch wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UISwitch wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UISwitch(nativeObj);
		}
		return null;
	}

	protected UISwitch(Object nativeObj) {
		super(nativeObj);
	}
	
	public UISwitch() {
		super(createNativeObj());
	}

	private static native Object createNativeObj() /*-[
	//@formatter:off
		return [[UISwitch alloc] init];
	//@formatter:on
	]-*/;
	
}
