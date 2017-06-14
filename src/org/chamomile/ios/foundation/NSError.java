package org.chamomile.ios.foundation;

/**
 * Information about an error condition including a domain, a domain-specific
 * error code, and application-specific information.
 * 
 * @author ggeorg
 */
public class NSError extends NSObject {
	public static NSError wrap(Object nativeObj) {
		if (nativeObj != null) {
			final NSError wrapper = NSObject.nativeToJava(nativeObj);
			return (wrapper != null) ? wrapper : new NSError(nativeObj);
		}
		return null;
	}

	protected NSError(Object nativeObj) {
		setNativeObj(nativeObj);
	}
}
