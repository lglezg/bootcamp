package com.example.bootcamp.ui.home.state

import com.example.bootcamp.domain.network.response.PageResponse

data class HomeState(
    val pageResponse: PageResponse? = null,
    val isLoading: Boolean = false
)