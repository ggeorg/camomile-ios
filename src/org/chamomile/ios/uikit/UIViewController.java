package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

/*-[
#import "UIViewControllerBase.h"
 ]-*/

/**
 * Provides the infrastructure for managing the views of your UIKit app.
 * 
 * @author ggeorg
 */
public abstract class UIViewController extends NSObject {

	public static final UIViewController wrap(Object nativeObj) {
		if (nativeObj != null) {
			return NSObject.nativeToJava(nativeObj);
		}
		return null;
	}

	public UIViewController() {
		setNativeObj(createNativeObj());
	}

	protected UIViewController(Object nativeObj) {
		setNativeObj(nativeObj);
	}

	private native Object createNativeObj() /*-[
	//@formatter:off
		OrgChamomileIosUikitUIViewControllerBase *viewController = 
			[[OrgChamomileIosUikitUIViewControllerBase alloc] initWithWrapper:self];
		return viewController;
	//formatter:on
	]-*/;
	
	public UIView getView() {
		return UIView.wrap(getViewImpl());
	}
	
	private native Object getViewImpl() /*-[
	//@formatter:off
		UIViewController *_self = [self getNativeObj];
		return [_self view];
	//@formatter:on
	]-*/;

	public abstract void viewDidLoad();

}
