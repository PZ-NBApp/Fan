package com.nbapp.fan.modules.player

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/players")
class PlayerController(val repository:PlayerRepository)
{
    fun getAll():
}