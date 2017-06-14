package org.chamomile.ios.webkit;

import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.foundation.NSObject;
import org.chamomile.ios.foundation.NSURL;
import org.chamomile.ios.foundation.NSURLRequest;
import org.chamomile.ios.uikit.UIView;

/*-[
#import <UIKit/UIKit.h>
#import <WebKit/WebKit.h>
]-*/

/**
 * A view that embeds web content in your app.
 * 
 * @author ggeorg
 */
public class WKWebView extends UIView {
	
	public static final WKWebView wrap(Object nativeObj) {
		if (nativeObj != null) {
			final WKWebView wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new WKWebView(nativeObj);
		}
		return null;
	}
	
	protected WKWebView(Object nativeObj) {
		super(nativeObj);
	}

	public WKWebView(CGRect frame) {
		super(createNativeObj(frame.origin.x, frame.origin.y, frame.size.width, frame.size.height));
	}

	public WKWebView(WKWebViewConfiguration theConfiguration, CGRect frame) {
		super(createNativeObj(theConfiguration, frame.origin.x, frame.origin.y, frame.size.width, frame.size.height));
	}

	private static native Object createNativeObj(float x, float y, float width, float height) /*-[
	//@formatter:off
		return [[WKWebView alloc] initWithFrame:CGRectMake(x, y, width, height)];
	//@formatter:on
	]-*/;

	private static native Object createNativeObj(WKWebViewConfiguration theConfiguration, float x, float y, float width,
			float height) /*-[
	//@formatter:off
		return [[WKWebView alloc] initWithFrame:CGRectMake(x, y, width, height) configuration:[theConfiguration getNativeObj]];
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Inspecting the View Information
	// ---------------------------------------------------------------------

	// TODO scrollView

	public native String getTitle() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		return _self.title;
	//@formatter:on
	]-*/;

	public NSURL getURL() {
		return NSURL.wrap(getURLImpl());
	}

	private native Object getURLImpl() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		return _self.URL;
	//@formatter:on
	]-*/;

	public native String getCustomUserAgent() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		return _self.customUserAgent;
	//@formatter:on
	]-*/;

	public native void setCustomUserAgent(String customUserAgent) /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		_self.customUserAgent = customUserAgent;
	//@formatter:on
	]-*/;
	
	// TODO serverTrust
	
	// ---------------------------------------------------------------------
	// Setting Delegates
	// ---------------------------------------------------------------------
	
	public native Object getNavigationDelegate() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		return _self.navigationDelegate;
	//@formatter:on
	]-*/;

	public native void setNavigationDelegate(WKNavigationDelegate navigationDelegate) /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		_self.navigationDelegate = navigationDelegate;
	//@formatter:on
	]-*/;
	
	public native void setUIDelegate(WKUIDelegate UIDelegate) /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		_self.UIDelegate = UIDelegate;
	//@formatter:on
	]-*/;

	// ---------------------------------------------------------------------
	// Loading Content
	// ---------------------------------------------------------------------
	
	public native double getEstimatedProgress() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		return _self.estimatedProgress;
	//@formatter:on
	]-*/;
	
	public native boolean hasOnlySecureContent() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		return _self.hasOnlySecureContent;
	//@formatter:on
	]-*/;
	
	private native Object loadHTMLString(String string, NSURL baseURL) /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		NSURL *_baseURL = [baseURL getNativeObj];
		return [_self loadHTMLString:string baseURL:_baseURL];
	//@formatter:on
	]-*/;
	
	public native boolean isLoading() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		return _self.loading;
	//@formatter:on
	]-*/;
	
	private native Object reload() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		return [_self reload];
	//@formatter:on
	]-*/;
	
	// TODO reload:
	
	private native Object reloadFromOrigin() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		return [_self reloadFromOrigin];
	//@formatter:on
	]-*/;
	
	// TODO reloadFromOrigin:
	
	public native void stopLoading() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		[_self stopLoading];
	//@formatter:on
	]-*/;
	
	// TODO stopLoading:
	
	// TODO loadData:MIMEType:characterEncodingName:baseURL:
	
	// TODO loadFileURL:allowingReadAccessToURL:

	// ---------------------------------------------------------------------
	// Scaling Content
	// ---------------------------------------------------------------------
	// ---------------------------------------------------------------------
	// Navigating
	// ---------------------------------------------------------------------
	
	// TODO allowsBackForwardNavigationGestures
	
	// TODO backForwardList
	
	public native boolean canGoBack() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		return _self.canGoBack;
	//@formatter:on
	]-*/;
	
	public native boolean canGoForward() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
		return _self.canGoForward;
	//@formatter:on
	]-*/;
	
	// TODO allowsLinkPreview
	
	public WKNavigation goBack()  {
		return WKNavigation.wrap(goBackImpl());
	}
	
	private native Object goBackImpl() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
    	return [_self goBack];
	//@formatter:on
	]-*/;
	
	// TODO goBack:

	public WKNavigation goForward()  {
		return WKNavigation.wrap(goForwardImpl());
	}
	
	private native Object goForwardImpl() /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
    	return [_self goForward];
	//@formatter:on
	]-*/;
	
	// TODO goForward:
	
	// TODO goToBackForwardListItem:
	
	@Deprecated
	public WKNavigation loadRequest(NSURLRequest request)  {
		return WKNavigation.wrap(loadRequestImpl(request));
	}
	
	private native Object loadRequestImpl(NSURLRequest request) /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
        NSURLRequest *_request = [request getNativeObj];
    	return [_self loadRequest:_request];
	//@formatter:on
	]-*/;

	public native void loadRequest(String url) /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
    	[_self loadRequest:[NSURLRequest requestWithURL:[NSURL URLWithString:url]]];
	//@formatter:on
	]-*/;
	
	// ---------------------------------------------------------------------
	// Executing JavaScript
	// ---------------------------------------------------------------------
	
	public native void evaluateJavaScript(String script) /*-[
	//@formatter:off
		WKWebView *_self = [self getNativeObj];
    	[_self evaluateJavaScript:script completionHandler:^(id result, NSError *error) {
	        if (error == nil) {
	            if (result != nil) {
	                //resultString = [NSString stringWithFormat:@"%@", result];
                    NSLog(@"============%@", result);
	            }
	        } else {
	            NSLog(@"evaluateJavaScript error : %@", error.localizedDescription);
	        }
	    }];
	//@formatter:on
	]-*/;
	
	// ---------------------------------------------------------------------
	// Taking Snapshots
	// ---------------------------------------------------------------------

	// TODO takeSnapshotWithConfiguration:completionHandler:
}
