package com.zm.org.kmp.presentaion

interface BaseView{
    fun showError(error: Throwable)
    fun hideLoading()
    fun showLoading()
}