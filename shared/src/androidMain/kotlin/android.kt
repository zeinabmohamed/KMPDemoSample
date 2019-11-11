package com.zm.org.kmp

import android.os.Build
import kotlin.coroutines.CoroutineContext

actual fun platFormName() : String {
    // this will be compiled  using kotlin/jvm
    return "Android ${Build.VERSION.RELEASE}"
}

actual fun systemVersion(): String {
    return "${Build.VERSION.SDK_INT}"
}

