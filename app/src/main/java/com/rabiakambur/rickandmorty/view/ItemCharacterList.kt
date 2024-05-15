package com.rabiakambur.rickandmorty.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.rabiakambur.rickandmorty.model.CharactersResultResponse

@Composable
fun ItemCharacterList(charactersResultResponse: CharactersResultResponse) {

    Card(
        modifier = Modifier
            .padding(top = 20.dp, start = 20.dp, end = 20.dp, bottom = 5.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        border = BorderStroke(2.dp, Color.Transparent)
    ) {

        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            AsyncImage(
                model = charactersResultResponse.characterImage,
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp,100.dp)
            )

            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.padding(all = 10.dp)
            ) {
                Text(
                    text = charactersResultResponse.characterName,
                    textAlign = TextAlign.Center,
                    fontSize = 17.sp,
                    fontStyle = FontStyle.Italic
                )
                Text(
                    text = charactersResultResponse.characterSpecies,
                    textAlign = TextAlign.Center,
                    fontSize = 17.sp,
                    fontStyle = FontStyle.Italic
                )
                Text(
                    text = charactersResultResponse.characterStatus,
                    textAlign = TextAlign.Center,
                    fontSize = 17.sp,
                    fontStyle = FontStyle.Italic
                )
            }
        }
    }
}