package core.combat

import core.entity.Entity

interface Move {
    fun performMove(attacker: Entity, attacked: Entity): Pair<Entity, Entity>
}