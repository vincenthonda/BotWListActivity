package com.example.botwlistactivity

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BotwService {
    @GET("api/v2")
    fun getItem(@Query("lastdays") lastdays: Int): Call<List<botwItem>>
}