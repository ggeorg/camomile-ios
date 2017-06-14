//
//  ChmViewControllerBase.m
//  j2objc
//
//  Created by George Georgopoulos on 14/06/2017.
//  Copyright © 2017 VeraCloud Inc. All rights reserved.
//

#import "UIViewControllerBase.h"

@interface OrgChamomileIosUikitUIViewControllerBase ()

@property (nonatomic, retain) OrgChamomileIosUikitUIViewController *wrapper;

@end

@implementation OrgChamomileIosUikitUIViewControllerBase

- (id)initWithWrapper:(OrgChamomileIosUikitUIViewController *)wrapper {
    self = [super init];
    if (self) {
        self.wrapper = wrapper;
    }
    return self;
}

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
    
    if (self.wrapper != nil) {
        [self.wrapper viewDidLoad];
    }
}

@end
