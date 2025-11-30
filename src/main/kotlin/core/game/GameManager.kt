package core.game

import core.entities.Entity

object GameManager {
    // Two separate lists: one for characters, one for enemies
    val characters = mutableListOf<Entity>()
    val enemies = mutableListOf<Entity>()

    fun addPlayer(entity: Entity) {
        characters.add(entity)
    }

    fun spawnEnemy(entity: Entity) {
        enemies.add(entity)
    }

    fun startTurn() {
        println("--- Player Turn ---")
        characters.forEach { character ->
            if (character.stats.hp > 0) {
                println("${character.name} is ready to act!")
                // Logic for player turn goes here
            }
        }
    }
}