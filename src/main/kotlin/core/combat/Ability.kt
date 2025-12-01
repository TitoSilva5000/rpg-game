package core.combat

import core.entity.Entity

class Ability(
    val name: String,
    val logic: (attacker: Entity, target: List<Entity>) -> Unit
)