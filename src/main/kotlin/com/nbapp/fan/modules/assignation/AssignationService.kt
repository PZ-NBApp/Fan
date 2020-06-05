package com.nbapp.fan.modules.assignation

import com.nbapp.fan.modules.player.Player
import com.nbapp.fan.modules.player.PlayerRepository
import com.nbapp.fan.modules.team.Team
import com.nbapp.fan.modules.team.TeamRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AssignationService(private val assignationRepository: AssignationRepository, val teamRepository: TeamRepository, val playerRepository: PlayerRepository) {

    fun getAssignations():Iterable<Assignation>
    {
        return assignationRepository.findAll()
    }

    fun getAssignationById(id:Int):Assignation{
        return assignationRepository.getOne(id)
    }
    @Transactional
    fun getAllByTeamId(teamId : Int) : Iterable<Assignation>
    {
        return assignationRepository.findAssignationsByTeamTeamId(teamId)
    }
}