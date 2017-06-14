package org.chamomile.ios.webkit;

import org.chamomile.ios.foundation.NSError;

/*-[
#import <WebKit/WebKit.h>
 ]-*/

/**
 * The methods of the {@code WKNavigationDelegate} protocol help you implement
 * custom behaviors that are triggered during a web view's process of accepting,
 * loading, and completing a navigation request.
 * 
 * @author ggeorg
 */
public abstract class WKNavigationDelegate {

	// ---------------------------------------------------------------------
	// Initiating the Navigation
	// ---------------------------------------------------------------------

	protected abstract void didCommitNavigation(WKWebView webView, WKNavigation navigation);
	
	@SuppressWarnings("unused")
	private void didCommitNavigation(Object webView, Object navigation) {
		final WKWebView _webView = WKWebView.wrap(webView);
		final WKNavigation _navigation = WKNavigation.wrap(navigation);
		didCommitNavigation(_webView, _navigation);
	}

	/*-[
	- (void)webView:(WKWebView *)webView 
		didCommitNavigation:(WKNavigation *)navigation {
			[self didCommitNavigationWithId:webView withId:navigation];
		}
	]-*/

	protected abstract void didStartProvisionalNavigation(WKWebView webView, WKNavigation navigation);

	@SuppressWarnings("unused")
	private void didStartProvisionalNavigation(Object webView, Object navigation) {
		final WKWebView _webView = WKWebView.wrap(webView);
		final WKNavigation _navigation = WKNavigation.wrap(navigation);
		didStartProvisionalNavigation(_webView, _navigation);
	}

	/*-[
	- (void)webView:(WKWebView *)webView 
		didStartProvisionalNavigation:(WKNavigation *)navigation {
			[self didStartProvisionalNavigationWithId:webView withId:navigation];
		}
	]-*/;

	// ---------------------------------------------------------------------
	// Responding to Server Actions
	// ---------------------------------------------------------------------

	protected abstract void didReceiveServerRedirectForProvisionalNavigation(WKWebView webView, WKNavigation navigation);
	
	@SuppressWarnings("unused")
	private void didReceiveServerRedirectForProvisionalNavigation(Object webView, Object navigation) {
		final WKWebView _webView = WKWebView.wrap(webView);
		final WKNavigation _navigation = WKNavigation.wrap(navigation);
		didReceiveServerRedirectForProvisionalNavigation(_webView, _navigation);
	}

	/*-[
	- (void)webView:(WKWebView *)webView 
		didReceiveServerRedirectForProvisionalNavigation:(WKNavigation *)navigation {
			[self didReceiveServerRedirectForProvisionalNavigationWithId:webView withId:navigation];
		}
	]-*/;

	// ---------------------------------------------------------------------
	// Authentication Challenges
	// ---------------------------------------------------------------------

	/*-
	- (void)webView:(WKWebView *)webView 
		didReceiveAuthenticationChallenge:(NSURLAuthenticationChallenge *)challenge 
		completionHandler:(void (^)(NSURLSessionAuthChallengeDisposition disposition, NSURLCredential *credential))completionHandler {
			NSLog(@">>>>>>>>>>>>>> didReceiveAuthenticationChallenge");
			completionHandler(YES);
		}
	-*/;

	// ---------------------------------------------------------------------
	// Reacting to Errors
	// ---------------------------------------------------------------------

	protected abstract void didFailNavigation(WKWebView webView, WKNavigation navigation, NSError error);

	@SuppressWarnings("unused")
	private void didFailNavigation(Object webView, Object navigation, Object error) {
		final WKWebView _webView = WKWebView.wrap(webView);
		final WKNavigation _navigation = WKNavigation.wrap(navigation);
		final NSError _error = NSError.wrap(error);
		didFailNavigation(_webView, _navigation, _error);
	}

	/*-[
	- (void)webView:(WKWebView *)webView 
		didFailNavigation:(WKNavigation *)navigation 
		withError:(NSError *)error {
			[self didFailNavigationWithId:webView withId:navigation withId:error];
		}
	]-*/;

	protected abstract void didFailProvisionalNavigation(WKWebView webView, WKNavigation navigation, NSError error);

	@SuppressWarnings("unused")
	private void didFailProvisionalNavigation(Object webView, Object navigation, Object error) {
		final WKWebView _webView = WKWebView.wrap(webView);
		final WKNavigation _navigation = WKNavigation.wrap(navigation);
		final NSError _error = NSError.wrap(error);
		didFailProvisionalNavigation(_webView, _navigation, _error);
	}

	/*-[
	- (void)webView:(WKWebView *)webView 
		didFailProvisionalNavigation:(WKNavigation *)navigation 
	  	withError:(NSError *)error {
			[self didFailProvisionalNavigationWithId:webView withId:navigation withId:error];
		}
	]-*/;

	// ---------------------------------------------------------------------
	// Tracking Load Progress
	// ---------------------------------------------------------------------

	protected abstract void webViewWebContentProcessDidTerminate(WKWebView webView);

	@SuppressWarnings("unused")
	private void webViewWebContentProcessDidTerminate(Object webView) {
		final WKWebView _webView = WKWebView.wrap(webView);
		webViewWebContentProcessDidTerminate(_webView);
	}

	/*-[
	- (void)webViewWebContentProcessDidTerminate:(WKWebView *)webView {
		 	[self webViewWebContentProcessDidTerminateWithId:webView];
		}
	]-*/;

	protected abstract void didFinishNavigation(WKWebView webView, WKNavigation navigation);

	@SuppressWarnings("unused")
	private void didFinishNavigation(Object webView, Object navigation) {
		final WKWebView _webView = WKWebView.wrap(webView);
		final WKNavigation _navigation = WKNavigation.wrap(navigation);
		didFinishNavigation(_webView, _navigation);
	}

	/*-[
	- (void)webView:(WKWebView*)webView
	 	didFinishNavigation:(WKNavigation*)navigation {
		 	[self didFinishNavigationWithId:webView withId:navigation];
		}
	]-*/;

	// ---------------------------------------------------------------------
	// Permitting Navigation
	// ---------------------------------------------------------------------

	protected abstract /* WKNavigationActionPolicy */int decidePolicyForNavigationAction(WKWebView webView,
			WKNavigationAction navigationAction);

	@SuppressWarnings("unused")
	private int decidePolicyForNavigationAction(Object webView, Object navigationAction) {
		final WKWebView _webView = WKWebView.wrap(webView);
		final WKNavigationAction _navigationAction = WKNavigationAction.wrap(navigationAction);
		return decidePolicyForNavigationAction(_webView, _navigationAction);
	}

	/*-[
	- (void)webView:(WKWebView *)webView 
		decidePolicyForNavigationAction:(WKNavigationAction *)navigationAction 
		decisionHandler:(void (^)(WKNavigationActionPolicy))decisionHandler {
			decisionHandler([self decidePolicyForNavigationActionWithId:webView withId:navigationAction]);
		}
	]-*/;

	protected abstract /* WKNavigationResponsePolicy */int decidePolicyForNavigationResponse(WKWebView webView,
			WKNavigationResponse navigationResponse);

	@SuppressWarnings("unused")
	private int decidePolicyForNavigationResponse(Object webView, Object navigationResponse) {
		final WKWebView _webView = WKWebView.wrap(webView);
		final WKNavigationResponse _navigationResponse = WKNavigationResponse.wrap(navigationResponse);
		return decidePolicyForNavigationResponse(_webView, _navigationResponse);
	}

	/*-[
	- (void)webView:(WKWebView *)webView 
		decidePolicyForNavigationResponse:(WKNavigationResponse *)navigationResponse 
		decisionHandler:(void (^)(WKNavigationResponsePolicy))decisionHandler {
			decisionHandler([self decidePolicyForNavigationResponseWithId:webView withId:navigationResponse]);
		}
	]-*/

}
