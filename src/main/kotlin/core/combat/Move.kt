package core.combat

import core.entities.Entity

interface Move {
    fun performMove(attacker: Entity, attacked: Entity): Pair<Entity, Entity>
}