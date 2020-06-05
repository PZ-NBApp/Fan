package com.nbapp.fan.modules.player

import javax.persistence.*

@Entity
data class Player (


        val firstName: String,

        val surname: String
)
{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val playerId: Int = 0
}