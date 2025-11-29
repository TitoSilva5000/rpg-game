package core.game

import core.entities.Entity

data class Game (
    val character: Entity,
    val enemy: Entity,
) {


    override fun toString(): String {
        return "Character: ${character.name}, Health: ${character.stats.hp}, Attack: ${character.stats.atk}, Shield: ${character.stats.shld} | " +
               "Enemy: ${enemy.name}, Health: ${enemy.stats.hp}, Attack: ${enemy.stats.atk}, Shield: ${enemy.stats.shld}"
    }

}