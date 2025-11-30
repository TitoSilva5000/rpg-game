package core

import core.entities.Entity
import core.entities.enemies.EnemyRole
import core.entities.characters.CharacterRole
import core.game.Game

fun printAttacker(game: Game) {
    val text = if (game.isPlayer1Turn) "Player 1" else "Player 2"
    println("$text is attacking")
}

fun main() {
    val hero = Entity("Hero", 1, CharacterRole.Attacker, )
    val entity2 = Entity("palex", 1, EnemyRole.Basic)

    var game = Game(entity1, entity2, true)

    println(game)
    printAttacker(game)
    game = game.attack()
    println(game)
    printAttacker(game)
    game = game.attack()
    println(game)
}