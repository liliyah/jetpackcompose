package com.example.paginationexample

import androidx.paging.PagingSource
import androidx.paging.PagingState

class GamesPagingSource (val gymsApiService:GameService=RetrofitInstance.gamesService):
    PagingSource<Int, Games>() {
    override fun getRefreshKey(state: PagingState<Int, Games>): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Games> {
        val pageNo = params.key ?: 0
        val games = gymsApiService.
        getGames(apiKey="2235532ab5mshbfb9a70faddbc00p166e0ajsn4957f5ff7bd3",
            host="free-nba.p.rapidapi.com",pageNumber = pageNo).
        games
        return LoadResult.Page(
data = games,
            prevKey =  if(pageNo==0) null else pageNo-1,
            nextKey = pageNo +1
        )

    }


}