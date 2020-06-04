package com.nbapp.fan.modules.player

import org.springframework.stereotype.Service

@Service
class PlayerService(private val playerRepository: PlayerRepository) {
    fun getPlayers():Iterable<Player> {
        return playerRepository.findAll()
    }

    fun getPlayerById(id : Int): Player {
        return playerRepository.getOne(id)
    }
}