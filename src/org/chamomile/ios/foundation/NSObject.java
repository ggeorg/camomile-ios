package org.chamomile.ios.foundation;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * State-less wrapper for native objects.
 * 
 * @author ggeorg
 */
public class NSObject {

	private static final Map<Object, NSObject> nativeObjMap = new WeakHashMap<>();

	@SuppressWarnings("unchecked")
	public static <T extends NSObject> T nativeToJava(Object nativeObj) {
		return (T) nativeObjMap.get(nativeObj);
	}

	// ---

	private Object nativeObj;

	protected void setNativeObj(Object nativeObj) {
		if (this.nativeObj != null) {
			throw new IllegalStateException("nativeObj already set.");
		}
		synchronized (nativeObjMap) {
			if (nativeObjMap.containsKey(nativeObj)) {
				throw new IllegalStateException("nativeObj already mapped.");
			}
			nativeObjMap.put(this.nativeObj = nativeObj, this);
		}
	}

	public Object getNativeObj() {
		return nativeObj;
	}
}
