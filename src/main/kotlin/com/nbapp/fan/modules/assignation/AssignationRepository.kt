package com.nbapp.fan.modules.assignation
import com.nbapp.fan.modules.player.Player
import org.springframework.data.jpa.repository.JpaRepository

import org.springframework.stereotype.Repository

@Repository
interface AssignationRepository: JpaRepository<Assignation, Int>{

    fun findAssignationsByTeamTeamId(teamId: Int) : Iterable<Assignation>
}

