package com.example.tvshowapp.api

import com.example.tvshowapp.helper.Constants
import com.example.tvshowapp.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getTvShows(): Response<TvShowResponse>
}