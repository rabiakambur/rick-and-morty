package com.rabiakambur.rickandmorty.model

import com.google.gson.annotations.SerializedName

data class CharactersResultResponse(
    @SerializedName ("name")
    val characterName: String,

    @SerializedName ("status")
    val characterStatus: String,

    @SerializedName ("species")
    val characterSpecies: String,

    @SerializedName ("image")
    val characterImage: String,
    )
