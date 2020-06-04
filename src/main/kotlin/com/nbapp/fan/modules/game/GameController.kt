package com.nbapp.fan.modules.game

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/game")
class GameController (private val gameService: GameService)
{
    @GetMapping
    fun getGames():Iterable<Game> {
        return gameService.getGames()
    }

    @GetMapping("/{id}")
    fun getGameById(@PathVariable id:Int): Game {
        return gameService.getGameById(id)
    }
}