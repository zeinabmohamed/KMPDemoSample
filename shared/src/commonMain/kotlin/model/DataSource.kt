package com.zm.org.kmp.model

import com.zm.org.kmp.model.api.NetworkApi
import com.zm.org.kmp.model.api.UpdateError

class DataSource {

    private val networkApi : NetworkApi = NetworkApi()

     suspend fun getMovies(): String {
         try {
             return networkApi.getTop100Movies()
         }catch (ex: Exception){
             println("================== ex ${ex.message} ===================")
             throw UpdateError(ex.message)
         }
    }
}