package core

import core.entities.Entity
import core.entities.Role
import core.game.Game

fun printAttacker(game: Game) {
    val text = if (game.isPlayer1Turn) "Player 1" else "Player 2"
    println("$text is attacking")
}

fun main() {
    val entity1 = Entity("palecas", 500, Role.ATTACKER)
    val entity2 = Entity("palex", 50, Role.DEFENDER)

    var game = Game(entity1, entity2, true)

    println(game)
    printAttacker(game)
    game = game.attack()
    println(game)
    printAttacker(game)
    game = game.attack()
    println(game)
}