package com.androiddevs.mvvmnewsapp.models

import com.androiddevs.mvvmnewsapp.models.Article

data class newsresponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)