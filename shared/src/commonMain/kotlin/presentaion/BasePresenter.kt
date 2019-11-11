package com.zm.org.kmp.presentaion

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class BasePresenter(
    private val presenterContext: CoroutineContext,
    private val baseView: BaseView
) : CoroutineScope {

    // general error handling for Async calls
    private val exceptionHandler: CoroutineExceptionHandler =
        CoroutineExceptionHandler { _, throwable ->

            baseView.showError(throwable)
        }
    private val job = Job()
    override val coroutineContext: CoroutineContext
        get() = presenterContext + job + exceptionHandler


    abstract fun  onCreate ()

    open fun onDestroy(){
        job.cancel()
    }
}