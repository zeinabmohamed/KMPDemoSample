package com.zm.org.kmp

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Runnable
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_main_queue
import platform.darwin.dispatch_queue_main_t
import kotlin.coroutines.CoroutineContext


// currently coroutines not support other thread dispatcher

actual val ApplicationDispatcher: CoroutineContext get() = MainLoopDispatcher(dispatch_get_main_queue())

class MainLoopDispatcher(val dispatchGetMainQueue: dispatch_queue_main_t) : CoroutineDispatcher() {
    override fun dispatch(context: CoroutineContext, block: Runnable) {
        dispatch_async(dispatchGetMainQueue){
            block.run()
        }
    }
}

