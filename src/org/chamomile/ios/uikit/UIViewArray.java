package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;
import org.chamomile.ios.foundation.NSObjectArray;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * A static ordered collection of {@link UIView}s.
 * 
 * @author ggeorg
 */
public class UIViewArray extends NSObjectArray<UIView> {

	public static final UIViewArray wrap(/* NSArray<__kindof UIView *> */Object nativeObj) {
		if (nativeObj != null) {
			final UIViewArray wrapper = NSObject.nativeToJava(nativeObj);
			return wrapper != null ? wrapper : new UIViewArray(nativeObj);
		}
		return null;
	}

	public UIViewArray(/* NSArray<__kindof UIView *> */Object nativeObj) {
		super(nativeObj);
	}

	@Override
	public UIView firstObject() {
		return UIView.wrap(super.firstObjectImpl());
	}

	@Override
	public UIView objectAtIndex(int index) {
		return UIView.wrap(super.objectAtIndexImpl(index));
	}
	
}
