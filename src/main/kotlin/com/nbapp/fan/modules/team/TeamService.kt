package com.nbapp.fan.modules.team

import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class TeamService(private val teamRepository: TeamRepository) {
    fun getTeams():Iterable<Team> {
        return teamRepository.findAll()
    }

    fun getTeamById(id : Int) : Team {
        return teamRepository.getOne(id)
    }

    fun getStandings():Iterable<Team>{
        return teamRepository.findAll().sortedByDescending {it.winPercentage}
    }
}