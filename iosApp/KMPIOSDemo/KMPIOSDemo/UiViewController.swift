//
//  UiViewController.swift
//  KMPIOSDemo
//
//  Created by Zeinab Abdelmawla on 11/6/19.
//  Copyright © 2019 Zeinab Abdelmawla. All rights reserved.
//

import Foundation
import shared
import UIKit

extension UIViewController :  BaseView{
    public func showError(error: KotlinThrowable) {
        let alert = UIAlertController(title: "Alert", message: error.message, preferredStyle: UIAlertController.Style.alert)
        alert.addAction(UIAlertAction(title: "Dissmiss", style : UIAlertAction.Style.default ,handler:  nil))
        self.present(alert, animated: true, completion: nil)
    }
    
    public func hideLoading() {
    print("hide loading")

    }
    
    public func showLoading() {
    
        print("show loading")
    }
    
    
    
}
