package j2objc;

import static org.chamomile.ios.uikit.UIViewAutoresizing.UIViewAutoresizingFlexibleHeight;
import static org.chamomile.ios.uikit.UIViewAutoresizing.UIViewAutoresizingFlexibleWidth;

import java.util.function.Consumer;

import org.chamomile.ios.uikit.UIViewController;
import org.chamomile.ios.webkit.WKFrameInfo;
import org.chamomile.ios.webkit.WKNavigationDelegate;
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
	}
}
