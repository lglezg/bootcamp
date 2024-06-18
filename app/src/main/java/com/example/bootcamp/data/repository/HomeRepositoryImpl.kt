package com.example.bootcamp.data.repository

import android.telecom.CallScreeningService.CallResponse
import android.util.Log
import com.example.bootcamp.data.remote.BootcampApi
import com.example.bootcamp.domain.repository.HomeRepository
import com.example.bootcamp.domain.network.response.PageResponse
import com.example.bootcamp.utils.NetworkResource
import retrofit2.Response

class HomeRepositoryImpl(
    private val api: BootcampApi

): HomeRepository {
    override suspend fun firstPage(): NetworkResource<PageResponse> {
        val response: Response<PageResponse>?
        return try {
            response = api.firstPage()
            if (response.isSuccessful) {
                NetworkResource.Success(response.body())
            } else {
                NetworkResource.Error(response.message())
            }
        } catch (e: Exception) {
            NetworkResource.Error(e.message ?: "Error")
        }
    }
}


