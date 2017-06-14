package org.chamomile.ios.webkit;

/**
 * The policy to pass back to the decision handler from the
 * {@link WKNavigationDelegate#decidePolicyForNavigationAction(WKWebView, WKNavigationAction)
 * method.
 * 
 * @author ggeorg
 */
public interface WKNavigationActionPolicy {
	int WKNavigationActionPolicyCancel = 0;
	int WKNavigationActionPolicyAllow = 1;
}
