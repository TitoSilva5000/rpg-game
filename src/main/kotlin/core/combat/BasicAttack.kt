package core.combat

import core.entities.Entity

abstract class BasicAttack() : Move {
    override fun performMove(attacker: Entity, attacked: Entity): Pair<Entity, Entity> {
        TODO("Not yet implemented")
    }
}