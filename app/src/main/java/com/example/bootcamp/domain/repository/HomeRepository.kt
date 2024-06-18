package com.example.bootcamp.domain.repository

import com.example.bootcamp.domain.network.response.PageResponse
import com.example.bootcamp.utils.NetworkResource

interface HomeRepository{

suspend fun firstPage(): NetworkResource<PageResponse>


}