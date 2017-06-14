package org.chamomile.ios.foundation;

/**
 * A static ordered collection of objects.
 * 
 * @author ggeorg
 *
 * @param <T> the object type
 */
public abstract class NSObjectArray<T extends NSObject> extends NSObject {

	protected NSObjectArray(Object nativeObj) {
		setNativeObj(nativeObj);
	}

	// ---------------------------------------------------------------------
	// Querying an Array
	// ---------------------------------------------------------------------
	
	public native boolean containsObject(T anObject) /*-[
	//@formatter:off
		NSArray  *_self = [self getNativeObj];
		NSObject *_anObject = [anObject getNativeObj];
		return [_self containsObject:_anObject];
	//@formatter:on
	]-*/;

	public native long getCount() /*-[
	//@formatter:off
		NSArray *_self = [self getNativeObj];
		return _self.count;
	//@formatter:on
	]-*/;
	
	public abstract T firstObject();

	protected native Object firstObjectImpl() /*-[
	//@formatter:off
		NSArray *_self = [self getNativeObj];
		return [_self firstObject];
	//@formatter:on
	]-*/;

	public abstract T objectAtIndex(int index);

	protected native Object objectAtIndexImpl(int index) /*-[
	//@formatter:off
		NSArray *_self = [self getNativeObj];
		return [_self objectAtIndex:index];
	//@formatter:on
	]-*/;
	
	// TODO objectsAtIndexes
	
	// TODO objectEnumerator
	
	// TODO reverseObjectEnumerator
	
	// ---------------------------------------------------------------------
	// Finding Objects in an Array
	// ---------------------------------------------------------------------
	
	public native long indexOfObject(T anObject) /*-[
	//@formatter:off
		NSArray  *_self = [self getNativeObj];
		NSObject *_anObject = [anObject getNativeObj];
		return [_self indexOfObject:_anObject];
	//@formatter:on
	]-*/;
	
}
