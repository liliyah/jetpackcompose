package com.example.paginationexample

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface GameService {

    @GET("/games?per_page=25")
   suspend fun getGames(
       @Header("X-RapidAPI-Key") apiKey:String="",
       @Header("X-RapidAPI-Host") host:String="",
       @Query("page") pageNumber:Int
   ):Data
}
//BASE URL =https://free-nba.p.rapidapi.com