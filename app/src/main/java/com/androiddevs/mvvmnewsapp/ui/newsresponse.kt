package com.androiddevs.mvvmnewsapp.ui

data class newsresponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)