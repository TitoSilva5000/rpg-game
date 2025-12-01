package core.entity

import core.combat.Ability
import core.combat.Moveset
import core.entity.role.Role

open class Entity (
    val name: String,
    val level: Int = 1,
    private val role: Role,
    val stats: Stats = role.baseStats
) {
    private var turn: Boolean = true
    val abilities = mutableListOf<Ability>()

    init {
        require(level in 1..100) {
            "level must be between 1 and 100"
        }
    }

    fun updateStats(stats: Stats): Entity {
        TODO()
        //return this.copy(stats = stats)
    }

    fun changeTurn() {
        turn = !turn
    }

    fun hasTurn(): Boolean {
        return turn
    }

}