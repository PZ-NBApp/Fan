package com.nbapp.fan.modules.game


import com.nbapp.fan.modules.team.TeamRepository
import org.springframework.stereotype.Service

@Service
class GameService(private val gameRepository: GameRepository) {
    fun getGames():Iterable<Game>{
        return gameRepository.findAll()
    }

    fun getGameById(id : Int): Game {
        return gameRepository.getOne(id)
    }

}