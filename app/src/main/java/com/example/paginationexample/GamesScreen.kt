package com.example.paginationexample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.itemContentType
import androidx.paging.compose.itemKey




@Composable
fun GamesScreen(gamesList: LazyPagingItems<Games>) {
    Column(modifier = Modifier) {
        Text(text = "Games:", modifier = Modifier.padding(4.dp))
        LazyColumn(contentPadding = PaddingValues(vertical = 8.dp, horizontal = 8.dp)) {
            items(key = gamesList.itemKey() ,count= gamesList.itemCount, contentType = gamesList.itemContentType()) {
                    index -> CreateGamesItem(index = index, games = gamesList[index])

            }
        }
    }
}

@Composable
fun CreateGamesItem(index: Int, games: Games?) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(3.dp)
    ) {
        Column(modifier = Modifier.padding(5.dp)) {

            Row(modifier = Modifier.padding(3.dp)) {
                Text(text = games?.home_team?.name ?: " ")
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "vs")
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = games?.visitor_team?.name ?: "")
            }

            Text(text = "Date is ${games?.date?.substring(0, 10)}")
            Text(text = "$index")
        }


    }

}