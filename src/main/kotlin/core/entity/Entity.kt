package core.entity

import core.combat.Moveset

data class Entity (
    val name: String,
    val level: Int = 1,
    private val role: Role,
    val moveSet: Moveset,
    val stats: Stats = role.baseStats
) {
    val hasTurn: Boolean = true

    init {
        require(level in 1..100) {
            "level must be between 1 and 100"
        }
    }

    fun updateStats(stats: Stats): Entity {
        return this.copy(stats = stats)
    }

}