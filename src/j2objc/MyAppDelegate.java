package j2objc;

import static org.chamomile.ios.uikit.UIScreen.getMainScreen;

import org.chamomile.ios.uikit.UIApplication;
import org.chamomile.ios.uikit.UIApplicationDelegate;
import org.chamomile.ios.uikit.UIColor;
import org.chamomile.ios.uikit.UIWindow;

public class MyAppDelegate extends UIApplicationDelegate {
	
	private UIWindow window = null;

	@Override
	protected boolean didFinishLaunching(UIApplication application)  {
        this.window = new UIWindow(getMainScreen().getBounds());
        this.window.setRootViewController(new ImageViewController());
        this.window.setBackgroundColor(UIColor.whiteColor());
        this.window.makeKeyAndVisible();
		return true;
	}

}
