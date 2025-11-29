package core

import core.entities.Entity
import core.entities.roles.CharacterRole

data class Player(
    val team: List<Entity> = listOf<Entity>(
        Entity("Hero", 1, CharacterRole.Attacker, ),
        Entity("Mage", 1, CharacterRole.Defender)
    )
) {

}