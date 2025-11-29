package core.combat

import core.entities.Entity

interface Ability {
    fun useAbility1(attacker: Entity, attacked: Entity): Pair<List<Entity>, List<Entity>>
    fun useAbility2(attacker: Entity, attacked: Entity): Pair<List<Entity>, List<Entity>>
    fun useAbility3(attacker: Entity, attacked: Entity): Pair<List<Entity>, List<Entity>>
}