package com.nbapp.fan.modules.player

import javax.persistence.*

@Entity
data class Player (


        val firstName: String,

        val surname: String
)
{
        constructor():this("",""){}
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val playerId: Int = 0
}