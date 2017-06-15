package j2objc;

import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.uikit.UIEventHandler;
import org.chamomile.ios.uikit.UIImage;
import org.chamomile.ios.uikit.UIImageView;
import org.chamomile.ios.uikit.UISlider;
import org.chamomile.ios.uikit.UIView;
import org.chamomile.ios.uikit.UIViewController;

public class ImageViewController extends UIViewController {
	
	@SuppressWarnings("unused")
	private UIEventHandler<UISlider> handler;

	@Override
	public void viewDidLoad() {
		UIView view = getView();
		CGRect viewRect = view.getFrame();

		UIImageView img = new UIImageView(UIImage.imageNamed("images.jpg"));
		img.setFrame(viewRect);
		
		view.addSubview(img);
	}
}
