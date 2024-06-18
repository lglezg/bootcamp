package com.example.bootcamp.data.remote

import com.example.bootcamp.domain.network.response.PageResponse
import retrofit2.Response
import retrofit2.http.GET

interface BootcampApi {

    @GET("pokemon")
    suspend fun firstPage(): Response<PageResponse>
}