package j2objc;

import static org.chamomile.ios.uikit.UIViewAutoresizing.UIViewAutoresizingFlexibleHeight;
import static org.chamomile.ios.uikit.UIViewAutoresizing.UIViewAutoresizingFlexibleWidth;

import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.uikit.UIColor;
import org.chamomile.ios.uikit.UISlider;
import org.chamomile.ios.uikit.UIView;
import org.chamomile.ios.uikit.UIViewController;

public class SliderViewController extends UIViewController {

	@Override
	public void viewDidLoad() {
		UIView view = getView();
		CGRect viewRect = view.getFrame();
		
		UISlider slider = new UISlider(10F, 50F, viewRect.size.width - 20F, 20F);
		slider.setMinimumValue(10);
		slider.setMaximumValue(20);
		slider.setValue(15, true);
		slider.setMinimumValueImage(slider.getMinimumTrackImageForState(UISlider.UIControlStateNormal));
		slider.setMinimumTrackTintColor(new UIColor(1F, .5F, 0F, 1F));
		
//		slider.setAutoresizingMask(UIViewAutoresizingFlexibleWidth 
//				| UIViewAutoresizingFlexibleHeight);

//		view.setAutoresizesSubviews(true);
		view.addSubview(slider);
	}
}
