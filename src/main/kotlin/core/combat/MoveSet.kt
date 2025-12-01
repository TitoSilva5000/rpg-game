package core.combat

import core.combat.ability.Ability
import core.entity.Entity

data class Moveset(val abilities: Ability) {
    fun basicAttack(attacker: Entity, attacked: Entity): Pair<Entity, Entity> {
        if (attacked.stats.shld > 0) {
            val newAttackedShield = attacked.stats.shld - Calculator.finalDamage(attacker.stats, attacked.stats)
            if (newAttackedShield < 0) {
                val newAttackedHealth = attacked.stats.hp + newAttackedShield
                attacked.updateStats(stats = attacked.stats.copy(hp = newAttackedHealth, shld = 0))
            } else {
                attacked.updateStats(stats = attacked.stats.copy(shld = newAttackedShield))
            }
        } else {
            val newAttackedHealth = attacked.stats.hp - Calculator.finalDamage(attacker.stats, attacked.stats)
            attacked.updateStats(stats = attacked.stats.copy(hp = newAttackedHealth))
        }
        return Pair(attacker, attacked)
    }

    //TODO: "Implement abilitys"
}