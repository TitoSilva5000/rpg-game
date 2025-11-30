package core.combat

import core.entity.Stats

object Calculator {
    fun finalDamage(attackerStats: Stats, attackedStats: Stats): Int {
        var totalDamage = 0
        // Change formula later
        totalDamage = attackerStats.atk * (1 - (attackedStats.def / (attackedStats.def + 20)))

        return totalDamage.toInt()
    }

    fun buffs(attackerStats: Stats, attackedStats: Stats): Double {
        TODO("Not yet implemented.")
    }

    fun debuffs(attackerStats: Stats, attackedStats: Stats): Double {
        TODO("Not yet implemented.")
    }
}