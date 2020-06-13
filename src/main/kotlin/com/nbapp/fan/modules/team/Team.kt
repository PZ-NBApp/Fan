package com.nbapp.fan.modules.team

import javax.persistence.*

@Entity
data class Team(


        val name: String,

        val city: String,

        var gamesPlayed: Int,

        var gamesWon: Int,

        var gamesLost: Int,

        var winPercentage: Float
)
{
        constructor():this("","",0,0,0,0.0f){
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val teamId: Int = 0
}