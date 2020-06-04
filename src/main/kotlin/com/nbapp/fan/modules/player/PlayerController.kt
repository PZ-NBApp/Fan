package com.nbapp.fan.modules.player

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/players")
class PlayerController (private val playerService: PlayerService)
{
    @GetMapping
    fun getPlayers():Iterable<Player> {
        return playerService.getPlayers()
    }

    @GetMapping("/{id}")
    fun getPlayerById(@PathVariable id:Int): Player {
        return playerService.getPlayerById(id)
    }

}