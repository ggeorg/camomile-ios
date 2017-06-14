package org.chamomile.ios.webkit;

import org.chamomile.ios.foundation.NSObject;

/*-[
#import <UIKit/UIKit.h>
#import <WebKit/WebKit.h>
]-*/

public class WKWebViewConfiguration extends NSObject {

	public WKWebViewConfiguration() {
		setNativeObj(createNativeObj());
	}

	private native Object createNativeObj() /*-[
		WKWebViewConfiguration *theConfiguration = [[WKWebViewConfiguration alloc] init];
		return theConfiguration;
	]-*/;
}
