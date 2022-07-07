package com.android.asif.llc.kotlin.trendymovies.android.model.movie

import com.google.gson.annotations.SerializedName

data class MovieReview (

    @SerializedName("author") val author : String,
    @SerializedName("content") val content : String,
    @SerializedName("id") val id : String,
    @SerializedName("url") val url : String
)