package core.game

import core.entities.Entity

data class Game (
    val player1: Entity,
    val player2: Entity,
    val isPlayer1Turn: Boolean
) {

    fun attack(): Game {
        // Inline if
        val attacker: Entity = if (isPlayer1Turn) player1 else player2
        var attacked: Entity = if (!isPlayer1Turn) player1 else player2

        if (attacked.stats.shld > 0) {
            val newPlayer2Shield = attacked.stats.shld - (attacker.stats.atk * 0.5).toInt()
            if (newPlayer2Shield < 0) {
                val newPlayer2Health = attacked.stats.hp + newPlayer2Shield
                attacked = attacked.updateStats(stats = attacked.stats.copy(hp = newPlayer2Health, shld = 0))

            } else {
                attacked = attacked.updateStats(stats = attacked.stats.copy(shld = newPlayer2Shield))
            }
        } else {
            val newPlayer2Health = attacked.stats.hp - attacker.stats.atk
            attacked = attacked.updateStats(stats = attacked.stats.copy(hp = newPlayer2Health))
        }
        return if (isPlayer1Turn) Game(attacker, attacked, false) else Game(attacked, attacker, true)
    }

    override fun toString(): String {
        return "Player 1: ${player1.name}, Health: ${player1.stats.hp}, Attack: ${player1.stats.atk}, Shield: ${player1.stats.shld} | " +
               "Player 2: ${player2.name}, Health: ${player2.stats.hp}, Attack: ${player2.stats.atk}, Shield: ${player2.stats.shld}"
    }

}