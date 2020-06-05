package com.nbapp.fan.modules.assignation

import com.nbapp.fan.modules.player.Player
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/assignation")
class AssignationController (private val assignationService: AssignationService) {
    @GetMapping
    fun getAssignations(): Iterable<Assignation> {
        return assignationService.getAssignations()
    }

    @GetMapping("/{id}")
    fun getAssignationById(@PathVariable id: Int): Assignation {
        return assignationService.getAssignationById(id)
    }

    @Transactional
    @GetMapping("/team/{id}")
    fun getTeamAllPlayers(@PathVariable id: Int): Iterable<Assignation> {
        return assignationService.getAllByTeamId(id)
    }
}