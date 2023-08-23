package com.example.paginationexample

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val gamesService:GameService=Retrofit.Builder().
    addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://free-nba.p.rapidapi.com").
        build().create(GameService::class.java)

}