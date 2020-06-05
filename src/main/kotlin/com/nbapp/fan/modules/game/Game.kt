package com.nbapp.fan.modules.game

import javax.persistence.*

@Entity
data class Game(
        val hostId: Int,
        val guestId: Int,
        var hostResult: Int,
        var guestResult: Int
)
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val gameId: Int = 0
}