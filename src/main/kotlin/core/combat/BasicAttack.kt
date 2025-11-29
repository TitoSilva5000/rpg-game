package core.combat

import core.entities.Entity

class BasicAttack() : Move {
    override fun performMove(attacker: Entity, attacked: Entity): Pair<Entity, Entity> {
        if (attacked.stats.shld > 0) {
            val newAttackedShield = attacked.stats.shld - DamageCalculator.calculateDamage(attacker.stats, attacked.stats)
            if (newAttackedShield < 0) {
                val newAttackedHealth = attacked.stats.hp + newAttackedShield
                attacked.updateStats(stats = attacked.stats.copy(hp = newAttackedHealth, shld = 0))
            } else {
                attacked.updateStats(stats = attacked.stats.copy(shld = newAttackedShield))
            }
        } else {
            val newAttackedHealth = attacked.stats.hp - DamageCalculator.calculateDamage(attacker.stats, attacked.stats)
            attacked.updateStats(stats = attacked.stats.copy(hp = newAttackedHealth))
        }
        return Pair(attacker, attacked)
    }
}