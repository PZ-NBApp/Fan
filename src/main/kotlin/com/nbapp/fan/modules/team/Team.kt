package com.nbapp.fan.modules.team

import javax.persistence.*

@Entity
class Team(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val teamId: Int? = null,

        val name: String,

        val city: String,

        var gamesPlayed: Int,

        var gamesWon: Int,

        var gamesLost: Int,

        var winPercentage: Float
)