package core.combat

import core.entities.Stats

object DamageCalculator {
    fun calculateDamage(attackerStats: Stats, attackedStats: Stats): Int {
        var totalDamage = 0
        // Change formula later
        totalDamage = attackerStats.atk * (1 - (attackedStats.def / (attackedStats.def + 20)))

        return totalDamage
    }
}