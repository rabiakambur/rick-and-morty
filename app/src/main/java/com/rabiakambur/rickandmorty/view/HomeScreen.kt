package com.rabiakambur.rickandmorty.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(modifier: Modifier) {

    val viewModel: HomeViewModel = viewModel()

    val data by viewModel.charactersListFlow.collectAsState()

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
    ) {
        items (data) {
            ItemCharacterList(it)
        }
    }
}