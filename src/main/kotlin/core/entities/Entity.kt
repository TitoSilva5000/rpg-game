package core.entities

import core.combat.Moveset
import core.entities.roles.Role

data class Entity (
    val name: String,
    val level: Int = 1,
    private val role: Role,
    val stats: Stats = role.stats,
    val hasTurn: Boolean = true,
    val moveSet: Moveset,

) {

    init {
        require(level in 1..100) {
            "level must be between 1 and 100"
        }
    }

    fun updateStats(stats: Stats): Entity {
        return this.copy(stats = stats)
    }

}