package com.zm.org.kmp

import platform.UIKit.UIDevice

actual fun platFormName():String{
    // UIDevice from kotlin-native lib
    // this will be compiled  using kotlin/native
    return "${UIDevice.currentDevice.systemName}"
}

actual fun systemVersion(): String {
    return UIDevice.currentDevice.systemVersion
}