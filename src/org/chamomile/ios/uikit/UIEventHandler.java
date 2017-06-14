package org.chamomile.ios.uikit;

import org.chamomile.ios.foundation.NSObject;

import com.google.j2objc.annotations.ObjectiveCName;

public abstract class UIEventHandler {

	@ObjectiveCName("onEvent:event:")
	public final void _onEvent(Object sender, Object event) {
		final UIEvent uiEvent = NSObject.nativeToJava(event);
		onEvent(NSObject.nativeToJava(sender), uiEvent != null ? uiEvent : new UIEvent(event));
	}

	public abstract void onEvent(UIControl sender, UIEvent event);
}
