package com.example.android_tp7.data.service.api

import com.example.android_tp7.data.service.response.ResultResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieClient {
    @GET("/3/movie/popular")
    fun getPopularMovies(): Call<ResultResponse>
}
