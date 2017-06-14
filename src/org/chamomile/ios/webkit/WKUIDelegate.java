package org.chamomile.ios.webkit;

import java.util.function.Consumer;

/*-[
#import <WebKit/WebKit.h>
 ]-*/

/**
 * The {@code WKUIDelegate} class provides methods for presenting native user
 * interface elements on behalf of a webpage.
 * 
 * @author ggeorg
 */
;

public abstract class WKUIDelegate {

	// ---------------------------------------------------------------------
	// Creating a Web View
	// ---------------------------------------------------------------------

	/*-
	- (WKWebView *)webView:(WKWebView *)webView 
		createWebViewWithConfiguration:(WKWebViewConfiguration *)configuration 
		forNavigationAction:(WKNavigationAction *)navigationAction 
		windowFeatures:(WKWindowFeatures *)windowFeatures {
	return nil;
	}
	]-*/;

	// ---------------------------------------------------------------------
	// Displaying UI Panels
	// ---------------------------------------------------------------------

	protected abstract void runJavaScriptAlertPanel(WKWebView webView, String message, WKFrameInfo frame,
			Consumer<Void> completionHandler);

	@SuppressWarnings("unused")
	private void runJavaScriptAlertPanel(Object webView, String message, Object frame, Object completionHandler) {
		final WKWebView _webView = WKWebView.wrap(webView);
		final WKFrameInfo _frame = WKFrameInfo.wrap(webView);
		final Consumer<Void> _completionHandler = new Consumer<Void>() {
			@Override
			public void accept(Void t) {
				acceptImpl(completionHandler);
			}

			private native void acceptImpl(Object completionHandler) /*-[
			//@formatter:off
				((void (^)(void))completionHandler)();
			//@formatter:on
			]-*/;
		};
		runJavaScriptAlertPanel(_webView, message, _frame, _completionHandler);
	}

	/*-[
	- (void)webView:(WKWebView *)webView 
		runJavaScriptAlertPanelWithMessage:(NSString *)message 
		initiatedByFrame:(WKFrameInfo *)frame 
		completionHandler:(void (^)(void))completionHandler
		{
			[self runJavaScriptAlertPanelWithId:webView 
				withNSString:message 
				withId:frame 
				withId:completionHandler];
		}
	]-*/

	protected abstract void runJavaScriptConfirmPanel(WKWebView webView, String message, WKFrameInfo frame,
			Consumer<Boolean> completionHandler);

	@SuppressWarnings("unused")
	private void runJavaScriptConfirmPanel(Object webView, String message, Object frame, Object completionHandler) {
		final WKWebView _webView = WKWebView.wrap(webView);
		final WKFrameInfo _frame = WKFrameInfo.wrap(webView);
		final Consumer<Boolean> _completionHandler = new Consumer<Boolean>() {
			@Override
			public void accept(Boolean t) {
				acceptImpl(completionHandler, t.booleanValue());
			}

			private native void acceptImpl(Object completionHandler, boolean t) /*-[
			//@formatter:off
				((void (^)(BOOL result))completionHandler)(t);
			//@formatter:on
			]-*/;
		};
		runJavaScriptConfirmPanel(_webView, message, _frame, _completionHandler);
	}

	/*-[
	- (void)webView:(WKWebView *)webView 
		runJavaScriptConfirmPanelWithMessage:(NSString *)message 
		initiatedByFrame:(WKFrameInfo *)frame 
		completionHandler:(void (^)(BOOL result))completionHandler
		{
			[self runJavaScriptConfirmPanelWithId:webView 
				withNSString:message 
				withId:frame 
				withId:completionHandler];
		}
	]-*/

	protected abstract void runJavaScriptTextInputPanel(WKWebView webView, String message, String defaultText,
			WKFrameInfo frame, Consumer<String> completionHandler);

	@SuppressWarnings("unused")
	private void runJavaScriptTextInputPanel(Object webView, String prompt, String defaultText, Object frame,
			Object completionHandler) {
		final WKWebView _webView = WKWebView.wrap(webView);
		final WKFrameInfo _frame = WKFrameInfo.wrap(webView);
		final Consumer<String> _completionHandler = new Consumer<String>() {
			@Override
			public void accept(String t) {
				acceptImpl(completionHandler, t);
			}

			private native void acceptImpl(Object completionHandler, String t) /*-[
			//@formatter:off
				((void (^)(NSString *result))completionHandler)(t);
			//@formatter:on
			]-*/;
		};
		runJavaScriptTextInputPanel(_webView, prompt, defaultText, _frame, _completionHandler);
	}

	/*-[
	- (void)webView:(WKWebView *)webView 
		runJavaScriptTextInputPanelWithPrompt:(NSString *)prompt 
		defaultText:(NSString *)defaultText 
		initiatedByFrame:(WKFrameInfo *)frame
		completionHandler:(void (^)(NSString *result))completionHandler 
		{
			[self runJavaScriptTextInputPanelWithId:webView 
				withNSString:prompt
				withNSString:defaultText
				withId:frame 
				withId:completionHandler];
		}
	]-*/;

	// ---------------------------------------------------------------------
	// Closing a Web View
	// ---------------------------------------------------------------------

	/*-
	- (void)webViewDidClose:(WKWebView *)webView {
	 return;
	}
	]-*/;

	// ---------------------------------------------------------------------
	// Displaying the Upload Panel
	// ---------------------------------------------------------------------

	/*-
	- (void)webView:(WKWebView *)webView 
	runOpenPanelWithParameters:(WKOpenPanelParameters *)parameters 
	initiatedByFrame:(WKFrameInfo *)frame 
	completionHandler:(void (^)(NSArray<NSURL *> *URLs))completionHandler{return;}
	]-*/;

	// ---------------------------------------------------------------------
	// Responding to Force Touch Actions
	// ---------------------------------------------------------------------

	/*-
	- (BOOL)webView:(WKWebView *)webView 
	shouldPreviewElement:(WKPreviewElementInfo *)elementInfo{return NO;}
	]-*/;

	/*-
	- (UIViewController *)webView:(WKWebView *)webView 
	previewingViewControllerForElement:(WKPreviewElementInfo *)elementInfo 
	           defaultActions:(NSArray<id<WKPreviewActionItem>> *)previewActions{return nil;}
	]-*/;

	/*-
	- (void)webView:(WKWebView *)webView 
	commitPreviewingViewController:(UIViewController *)previewingViewController{return;}
	]-*/;
}
