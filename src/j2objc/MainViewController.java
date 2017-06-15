package j2objc;

import static org.chamomile.ios.uikit.UIViewAutoresizing.UIViewAutoresizingFlexibleHeight;
import static org.chamomile.ios.uikit.UIViewAutoresizing.UIViewAutoresizingFlexibleWidth;
import static org.chamomile.ios.webkit.WKNavigationActionPolicy.WKNavigationActionPolicyAllow;
import static org.chamomile.ios.webkit.WKNavigationResponsePolicy.WKNavigationResponsePolicyAllow;

import java.util.function.Consumer;

import org.chamomile.ios.foundation.NSError;
import org.chamomile.ios.uikit.UIViewController;
import org.chamomile.ios.webkit.WKFrameInfo;
import org.chamomile.ios.webkit.WKNavigation;
import org.chamomile.ios.webkit.WKNavigationAction;
import org.chamomile.ios.webkit.WKNavigationDelegate;
import org.chamomile.ios.webkit.WKNavigationResponse;
import org.chamomile.ios.webkit.WKNavigationResponsePolicy;
import org.chamomile.ios.webkit.WKUIDelegate;
import org.chamomile.ios.webkit.WKWebView;

public class MainViewController extends UIViewController {

	private WKNavigationDelegate navigationDelegate;
	private WKUIDelegate UIDelegate;

	@Override
	public void viewDidLoad() {

		// WKWebViewConfiguration conf = new WKWebViewConfiguration();
		// WKWebView webview = new WKWebView(conf);

		WKWebView webView = new WKWebView(getView().getFrame());
		webView.setNavigationDelegate(navigationDelegate = new WKNavigationDelegate() {

			@Override
			protected void didCommitNavigation(WKWebView webView, WKNavigation navigation) {
				System.out.println("=========> didCommitNavigation: " + webView);
			}

			@Override
			protected void didStartProvisionalNavigation(WKWebView webView, WKNavigation navigation) {
				System.out.println("=========> didStartProvisionalNavigation: " + webView);
			}

			@Override
			protected void didReceiveServerRedirectForProvisionalNavigation(WKWebView webView,
					WKNavigation navigation) {
				System.out.println("=========> didReceiveServerRedirectForProvisionalNavigation: " + webView);
			}

			@Override
			protected void didFailNavigation(WKWebView webView, WKNavigation navigation, NSError error) {
				System.out.println("=========> didReceiveServerRedirectForProvisionalNavigation: " + error);
			}

			@Override
			protected void didFailProvisionalNavigation(WKWebView webView, WKNavigation navigation, NSError error) {
				System.out.println("=========> didReceiveServerRedirectForProvisionalNavigation: " + error);
			}

			@Override
			protected void webViewWebContentProcessDidTerminate(WKWebView webView) {
				System.out.println("=========> webViewWebContentProcessDidTerminate: " + webView);
			}

			@Override
			protected void didFinishNavigation(WKWebView webView, WKNavigation navigation) {
				System.out.println("=========> didFinishNavigation: " + webView);
			}

			@Override
			protected int decidePolicyForNavigationAction(WKWebView webView,
					WKNavigationAction navigationAction) {
				System.out.println("=========> decidePolicyForNavigationAction: " + webView);
				return WKNavigationActionPolicyAllow;
			}

			@Override
			protected int decidePolicyForNavigationResponse(WKWebView webView,
					WKNavigationResponse navigationResponse) {
				System.out.println("=========> didFinishNavigation: " + webView);
				return WKNavigationResponsePolicyAllow;
			}
		});

		webView.setUIDelegate(UIDelegate = new WKUIDelegate() {
			
			@Override
			protected void runJavaScriptAlertPanel(WKWebView webView, String message, WKFrameInfo frame,
					Consumer<Void> completionHandler) {
				System.out.println(">>> runJavaScriptAlertPanel: " + message);

				completionHandler.accept(null);
			}

			@Override
			protected void runJavaScriptConfirmPanel(WKWebView webView, String message, WKFrameInfo frame,
					Consumer<Boolean> completionHandler) {
				System.out.println(">>> runJavaScriptConfirmPanel: " + message);

				completionHandler.accept(false);
			}

			@Override
			protected void runJavaScriptTextInputPanel(WKWebView webView, String prompt, String defaultText,
					WKFrameInfo frame, Consumer<String> completionHandler) {
				System.out.println(">>> runJavaScriptConfirmPanel: " + prompt + ", " + defaultText);

				completionHandler.accept(null);
			}
		});

		webView.setAutoresizingMask(UIViewAutoresizingFlexibleWidth | UIViewAutoresizingFlexibleHeight);

		getView().addSubview(webView);
		getView().setAutoresizesSubviews(true);

		// _URL = new NSURL("https://www.google.com");
		// webView.loadRequest(new NSURLRequest(new
		// NSURL("https://www.google.com")));
		webView.loadRequest("https://www.google.com");
		webView.evaluateJavaScript("1+3");
		webView.evaluateJavaScript("alert('alert');");
		webView.evaluateJavaScript("confirm('confirm');");
		webView.evaluateJavaScript("prompt('prompt');");
		webView.evaluateJavaScript("{l:8, p:7}");
	}
}
