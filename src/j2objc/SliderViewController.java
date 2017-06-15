package j2objc;

import static org.chamomile.ios.uikit.UIViewAutoresizing.UIViewAutoresizingFlexibleHeight;
import static org.chamomile.ios.uikit.UIViewAutoresizing.UIViewAutoresizingFlexibleWidth;

import org.chamomile.ios.core.graphics.CGRect;
import org.chamomile.ios.uikit.UIColor;
import org.chamomile.ios.uikit.UIControl;
import org.chamomile.ios.uikit.UIEvent;
import org.chamomile.ios.uikit.UIEventHandler;
import org.chamomile.ios.uikit.UISlider;
import org.chamomile.ios.uikit.UISwitch;
import org.chamomile.ios.uikit.UIView;
import org.chamomile.ios.uikit.UIViewController;

public class SliderViewController extends UIViewController {
	
	@SuppressWarnings("unused")
	private UIEventHandler<UISlider> handler;

	@Override
	public void viewDidLoad() {
		UIView view = getView();
		CGRect viewRect = view.getFrame();

		UISlider slider = new UISlider(10F, 50F, viewRect.size.width - 20F, 20F);
		slider.setMinimumValue(10);
		slider.setMaximumValue(20);
//		slider.setValue(15, true);
		slider.setMinimumValueImage(slider.getMinimumTrackImageForState(0));
		slider.setMaximumValueImage(slider.getMaximumTrackImageForState(0));
		slider.setMinimumTrackTintColor(new UIColor(1F, .5F, 0F, 1F));
		slider.setMaximumTrackTintColor(new UIColor(1F, .5F, 1F, 1F));
		slider.setThumbTintColor(new UIColor(0F, .5F, 1F, 1F));

		slider.addTarget(handler = new UIEventHandler<UISlider>() {
			@Override
			public void onEvent(UISlider sender, UIEvent event) {
				System.out.println("=======> " + sender + ": " + slider.getValue());
			}
		}, UIControl.UIControlEventTouchDragInside);

		slider.setAutoresizingMask(UIViewAutoresizingFlexibleWidth
				| UIViewAutoresizingFlexibleHeight);

		// view.setAutoresizesSubviews(true);
		view.addSubview(slider);
		

		UISwitch _switch = new UISwitch(10F, 100F, viewRect.size.width - 20F, 20F);
		_switch.setOn(!true);
		view.addSubview(_switch);
	}
}
