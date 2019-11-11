package com.zm.org.kmp.presentaion.movies

import com.zm.org.kmp.ApplicationDispatcher
import com.zm.org.kmp.model.DataSource
import com.zm.org.kmp.presentaion.BasePresenter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MoviesPresenter(
    private val view: MoviesView,
    private val dataSource: DataSource = DataSource()
) : BasePresenter(ApplicationDispatcher, view) {
    override fun onCreate() {
    }

    fun getMovies() {
      //  println("================== view.showLoading() ===================")
        view.showLoading()
        launch {
            val result = dataSource.getMovies()
        //    println("================== dataSource.getMovies ===================")
         //       println("================== withContext(Dispatchers.Main ) ===================")
                view.movies(result)
        //        println("================== END withContext(Dispatchers.Main ) ===================")


        }.invokeOnCompletion {
                view.hideLoading()
          //  println("================== END view.hideLoading() ===================")

        }
    }
}
