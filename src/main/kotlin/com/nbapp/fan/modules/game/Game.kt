package com.nbapp.fan.modules.game
import com.nbapp.fan.modules.player.Player
import com.nbapp.fan.modules.team.Team
import javax.persistence.*

@Entity
data class Game(
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "hostId")
        var host : Team,
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "guestId")
        var guest : Team,
        var hostResult: Int,
        var guestResult: Int)

{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val gameId: Int = 0
    fun updateHostResult(newResult: Int){
        hostResult = newResult
    }
    fun updateGuestResult(newResult: Int){
        guestResult=newResult
    }
}
