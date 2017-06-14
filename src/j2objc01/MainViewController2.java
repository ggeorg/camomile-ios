package j2objc01;

import org.chamomile.ios.uikit.UIEventHandler;
import org.chamomile.ios.uikit.UIButton;
import org.chamomile.ios.uikit.UIColor;
import org.chamomile.ios.uikit.UIControl;
import org.chamomile.ios.uikit.UIEvent;
import org.chamomile.ios.uikit.UILabel;
import org.chamomile.ios.uikit.UITextField;
import org.chamomile.ios.uikit.UIViewController;
import org.chamomile.ios.webkit.WKWebView;
import org.chamomile.ios.webkit.WKWebViewConfiguration;

public class MainViewController2 extends UIViewController {

	@SuppressWarnings("unused")
	private UIEventHandler handler;

	@Override
	public void viewDidLoad() {
		System.out.println(">>> Viejahsk djahkjshdk jahkjs kdjahkjs dkhaks kdjashdjw Did Load");

		System.out.println(">>> " + getView());
		
		UIButton btn = new UIButton();
		btn.addTarget(handler = new UIEventHandler() {
			@Override
			public void onEvent(UIControl sender, UIEvent event) {
				System.out.println("Button clicked! " + sender);
			}
		}, UIButton.UIControlEventTouchUpInside);

		getView().addSubview(btn);
		UILabel l = new UILabel("Hello, World!");
		l.sizeToFit();
		getView().addSubview(l);
		
		//l.setBackgroundColor(new UIColor(1F, 0F, 0F, 1F));
		//l.setAlpha(.3F);
		l.setTintColor(new UIColor(0F, 0F, 1F, 1F));
//        addSubview(new UITextField());
		
//		WKWebViewConfiguration conf = new WKWebViewConfiguration();
//		WKWebView webView = new WKWebView(conf);
//
//		addSubview(webView);
//        
//        
//        webView.load("https://www.google.com");
		
		for (int i = 0; i < getView().getSubviews().getCount(); i++) {
			System.out.println(getView().getSubviews().objectAtIndex(i));
		}
		
		System.out.println(getView().getSubviews().containsObject(l));
		System.out.println(getView().getSubviews().indexOfObject(l));
	}
}
