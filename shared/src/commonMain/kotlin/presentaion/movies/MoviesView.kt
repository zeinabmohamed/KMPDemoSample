package com.zm.org.kmp.presentaion.movies

import com.zm.org.kmp.presentaion.BaseView

interface MoviesView  : BaseView{
    fun movies(result: String)
}