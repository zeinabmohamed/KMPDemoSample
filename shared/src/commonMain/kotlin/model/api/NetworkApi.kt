package com.zm.org.kmp.model.api

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url

class NetworkApi {

    // build  network client
val client  = HttpClient()


    suspend fun getTop100Movies() : String {
       val result  :  String =   client.get {
            url("https://api.myjson.com/bins/8o2fk")
        }

        println(result)
        return result
    }
}