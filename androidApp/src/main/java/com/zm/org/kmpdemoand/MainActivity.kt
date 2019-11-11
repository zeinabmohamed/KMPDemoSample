package com.zm.org.kmpdemoand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.zm.org.kmp.Greeting
import com.zm.org.kmp.model.DataSource
import com.zm.org.kmp.presentaion.movies.MoviesPresenter
import com.zm.org.kmp.presentaion.movies.MoviesView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MoviesView {


    val presenter: MoviesPresenter by lazy { MoviesPresenter(this, DataSource()) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // test android shared code
        testTextView.text = Greeting().getGreeting()

        presenter.onCreate()
        presenter.getMovies()

    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }


    override fun movies(result: String) {
        runOnUiThread {
            println("================== response start ===================")
            println("Show $result")
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "Show $result", Toast.LENGTH_SHORT).show()
            println("================== response end ===================")
        }

    }
    override fun showError(error: Throwable) {
        runOnUiThread {
            Toast.makeText(this, error.message, Toast.LENGTH_SHORT).show()
        }
    }
    override fun showLoading() {

            Toast.makeText(this,"Show loading", Toast.LENGTH_SHORT).show()

    }
    override fun hideLoading() {
        runOnUiThread {
            Handler().postDelayed({
                Toast.makeText(this,"Hide loading", Toast.LENGTH_SHORT).show()

            },5000)

        }
    }



}
