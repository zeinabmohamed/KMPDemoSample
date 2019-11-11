package com.zm.org.kmp

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

actual val ApplicationDispatcher: CoroutineContext
    get() = Dispatchers.IO