package core

import core.entity.Entity
import core.game.Game

fun printAttacker(game: Game) {
    val text = if (game.isPlayer1Turn) "Player 1" else "Player 2"
    println("$text can attack")
}

fun main() {
    val player = Player(team = mutableListOf(hero))
    val enemySquad = List

    var game = Game(player, enemySquad, true)

    println(game)
    printAttacker(game)
    game = game.attack()
    println(game)
    printAttacker(game)
    game = game.attack()
    println(game)
}