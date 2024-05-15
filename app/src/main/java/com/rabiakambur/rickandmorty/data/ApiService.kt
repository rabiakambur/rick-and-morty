package com.rabiakambur.rickandmorty.data

import com.rabiakambur.rickandmorty.model.CharactersResponse
import retrofit2.http.GET

interface ApiService{

    @GET ("character")
    suspend fun getCharacters(): CharactersResponse
}