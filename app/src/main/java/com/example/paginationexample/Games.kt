package com.example.paginationexample

import com.google.gson.annotations.SerializedName


data class Data (
    @SerializedName("data")
    var games:List<Games>)

 data class Games(var id:Int?= null,
                  var date:String?=null,
                  val home_team:Team?= Team(),
                  val home_team_score:Int?=null,
                  val period:Int?=null,
                  val postseason:Boolean?=null,
                  val season:Int?=null,
                  val status:String?=null,
                  val time:String?=null,
                  val visitor_team:Team= Team(),
                  val visitor_team_score:Int?=null

 )
data class Team(val id:Int?=null,
                val abbreviation:String?=null,
                val city:String?=null,
                val conference :String?=null,
                val division :String?=null,
                val full_name:String?=null,
                val name:String?=null)
