package org.chamomile.ios.webkit;

/**
 * The policy to pass back to the decision handler from the
 * {@link WKNavigationDelegate#decidePolicyForNavigationResponse(WKWebView, WKNavigationResponse)}
 * method.
 * 
 * @author ggeorg
 */
public interface WKNavigationResponsePolicy {
	int WKNavigationResponsePolicyCancel = 0;
	int WKNavigationResponsePolicyAllow = 1;
}
