package org.chamomile.ios.uikit;

/*-[
#import <UIKit/UIKit.h>
 ]-*/

/**
 * A set of methods that are called by the singleton UIApplication object in
 * response to important events in the lifetime of your app.
 * 
 * @author ggeorg
 */
public abstract class UIApplicationDelegate /*<UIApplicationDelegate>*/ {
	
	protected abstract boolean didFinishLaunching(UIApplication application, UIWindow window);
	
	@SuppressWarnings("unused")
	private boolean didFinishLaunching(Object application, Object window) {
		UIApplication _application = UIApplication.wrap(application);
		UIWindow _window = UIWindow.wrap(window);
		return didFinishLaunching(_application, _window);
	}

	/*-[
	//@formatter:off
	- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
	    UIWindow *window = [[UIWindow alloc] initWithFrame:[[UIScreen mainScreen] bounds]];
	    // Override point for customization after application launch.
	    return [self didFinishLaunchingWithId:application withId:window];
	}

	- (void)applicationWillResignActive:(UIApplication *)application {
	    // Sent when the application is about to move from active to inactive state. This can occur for certain types of temporary interruptions (such as an incoming phone call or SMS message) or when the user quits the application and it begins the transition to the background state.
	    // Use this method to pause ongoing tasks, disable timers, and invalidate graphics rendering callbacks. Games should use this method to pause the game.
	}

	- (void)applicationDidEnterBackground:(UIApplication *)application {
	    // Use this method to release shared resources, save user data, invalidate timers, and store enough application state information to restore your application to its current state in case it is terminated later.
	    // If your application supports background execution, this method is called instead of applicationWillTerminate: when the user quits.
	}

	- (void)applicationWillEnterForeground:(UIApplication *)application {
	    // Called as part of the transition from the background to the active state; here you can undo many of the changes made on entering the background.
	}
	
	- (void)applicationDidBecomeActive:(UIApplication *)application {
	    // Restart any tasks that were paused (or not yet started) while the application was inactive. If the application was previously in the background, optionally refresh the user interface.
	}

	- (void)applicationWillTerminate:(UIApplication *)application {
	    // Called when the application is about to terminate. Save data if appropriate. See also applicationDidEnterBackground:.
	}
	//@formatter:on
	]-*/
}
