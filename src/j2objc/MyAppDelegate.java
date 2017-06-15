package j2objc;

import org.chamomile.ios.uikit.UIApplication;
import org.chamomile.ios.uikit.UIApplicationDelegate;
import org.chamomile.ios.uikit.UIColor;
import org.chamomile.ios.uikit.UIWindow;

public class MyAppDelegate extends UIApplicationDelegate {
	
	private UIWindow window = null;

	@Override
	protected boolean didFinishLaunching(UIApplication application, UIWindow window)  {
        this.window = window;
        this.window.setRootViewController(new ImageViewController());
        this.window.setBackgroundColor(UIColor.whiteColor());
        
		System.out.println(">>>> " + window);
		return true;
	}

}
