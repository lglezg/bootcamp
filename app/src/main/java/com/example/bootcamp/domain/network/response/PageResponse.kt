package com.example.bootcamp.domain.network.response

import com.google.gson.annotations.SerializedName


data class PageResponse(
    @SerializedName("count")
    val count: Int? = null,
    @SerializedName("next")
    val next: String? = null,
    @SerializedName("previous")
    val previous: String? = null,
    @SerializedName("results")
    val results: List<PokemonItem> = emptyList()
)

data class PokemonItem(
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("url")
    val url: String? = null
)