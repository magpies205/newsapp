package com.androiddevs.mvvmnewsapp.repository

import com.androiddevs.mvvmnewsapp.db.ArticleDataBase
import com.androiddevs.mvvmnewsapp.ui.api.retrofitinstance


class NewsRepository(
    val db: ArticleDataBase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        retrofitinstance.api.getBreakingNews(countryCode, pageNumber)
}