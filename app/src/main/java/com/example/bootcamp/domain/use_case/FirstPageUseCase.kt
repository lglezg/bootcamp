package com.example.bootcamp.domain.use_case

import com.example.bootcamp.domain.network.response.PageResponse
import com.example.bootcamp.utils.NetworkResource

interface FirstPageUseCase {
    suspend operator fun invoke (): NetworkResource<PageResponse>
}
