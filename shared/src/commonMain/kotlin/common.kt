package com.zm.org.kmp

import kotlin.coroutines.CoroutineContext

expect fun platFormName(): String
expect fun systemVersion(): String

expect val ApplicationDispatcher : CoroutineContext

class Greeting {
    fun getGreeting(): String = "Hello ${platFormName()} "

}