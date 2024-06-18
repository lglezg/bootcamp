package com.example.bootcamp.data.use_case

import com.example.bootcamp.data.remote.BootcampApi
import com.example.bootcamp.domain.network.response.PageResponse
import com.example.bootcamp.domain.repository.HomeRepository
import com.example.bootcamp.domain.use_case.FirstPageUseCase
import com.example.bootcamp.utils.NetworkResource

class FirstPageUseCaseImpl(
    private val homeRepository: HomeRepository
): FirstPageUseCase {
    override suspend fun invoke(): NetworkResource<PageResponse> {
        return homeRepository.firstPage()
    }
}