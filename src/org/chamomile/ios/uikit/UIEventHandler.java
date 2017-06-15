package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

import com.google.j2objc.annotations.ObjectiveCName;

public abstract class UIEventHandler<T extends UIControl> {

	@ObjectiveCName("onEvent:event:")
	public final void _onEvent(Object sender, Object event) {
		onEvent(NSObject.nativeToJava(sender), UIEvent.wrap(event));
	}

	public abstract void onEvent(T sender, UIEvent event);
}
