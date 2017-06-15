package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

public class UIImageView extends UIView {

	public static final UIImageView wrap(Object nativeObj) {
		if (nativeObj != null) {
			final UIImageView wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new UIImageView(nativeObj);
		}
		return null;
	}

	protected UIImageView(Object nativeObj) {
		super(nativeObj);
	}

	public UIImageView(UIImage image) {
		super(createNativeObj(image));
	}

	private static native Object createNativeObj() /*-[
	//@formatter:off
		return [[UIImageView alloc] init];
	//@formatter:on
	]-*/;

	private static native Object createNativeObj(UIImage image) /*-[
	//@formatter:off
		UIImage *_image = [image getNativeObj];
		return [[UIImageView alloc] initWithImage:_image];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Accessing the Displayed Images
	// ---------------------------------------------------------------------

	public UIImage getImage() {
		return UIImage.wrap(getImageImpl());
	}

	private native Object getImageImpl() /*-[
	//@formatter:off
		UIImageView *_self = [self getNativeObj];
		return _self.image;
	//@formatter:on
	]-*/;

	public native void setImage(UIImage image) /*-[
	//@formatter:off
		UIImageView *_self = [self getNativeObj];
		UIImage *_image = [image getNativeObj];
		_self.image = _image;
	//@formatter:on
	]-*/;
}
