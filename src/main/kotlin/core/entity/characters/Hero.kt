package core.entity.characters

import core.combat.Ability
import core.entity.Entity
import core.entity.role.Attacker

class Hero : Entity(
    name = "Hero",
    level = 1,
    role = Attacker,
) {
    init {
        abilities.add(
            Ability("Heavy Attack") { attacker, target ->

            }
        )
    }
}