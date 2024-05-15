package com.rabiakambur.rickandmorty.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rabiakambur.rickandmorty.data.ApiClient
import com.rabiakambur.rickandmorty.model.CharactersResultResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val _charactersListFlow: MutableStateFlow<List<CharactersResultResponse>> = MutableStateFlow(listOf())
    val charactersListFlow: StateFlow<List<CharactersResultResponse>> = _charactersListFlow

    init {
        fetchCharacters()
    }

    private fun fetchCharacters() {
        viewModelScope.launch {
            val characters = ApiClient.retrofit.getCharacters()
            _charactersListFlow.value = characters.results

        }

    }
}