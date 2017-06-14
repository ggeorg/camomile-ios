package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;
import org.chamomile.ios.foundation.NSObjectArray;

public final class NSLayoutConstraintArray extends NSObjectArray<NSLayoutConstraint> {

	public static final NSLayoutConstraintArray wrap(/* NSArray<__kindof NSLayoutConstraint *> */Object nativeObj) {
		if (nativeObj != null) {
			final NSLayoutConstraintArray wrapper = NSObject.nativeToJava(nativeObj);
			return wrapper != null ? wrapper : new NSLayoutConstraintArray(nativeObj);
		}
		return null;
	}

	public NSLayoutConstraintArray(/* NSArray<__kindof NSLayoutConstraint *> */Object nativeObj) {
		super(nativeObj);
	}

	@Override
	public NSLayoutConstraint firstObject() {
		return NSLayoutConstraint.wrap(firstObjectImpl());
	}

	@Override
	public NSLayoutConstraint objectAtIndex(int index) {
		return NSLayoutConstraint.wrap(objectAtIndexImpl(index));
	}

}
