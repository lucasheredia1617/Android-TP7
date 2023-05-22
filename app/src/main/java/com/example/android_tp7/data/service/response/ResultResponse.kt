package com.example.android_tp7.data.service.response

import com.google.gson.annotations.SerializedName

data class ResultResponse(
    @SerializedName("results")
    val movies: MutableList<MovieResponse>
)