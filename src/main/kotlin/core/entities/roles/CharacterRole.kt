package core.entities.roles

import core.entities.Stats

sealed class CharacterRole(stats: Stats) : Role(stats) {
    object Attacker : CharacterRole(Stats(hp = 1000, shld = 0, def = 300, atk = 580, stg = 0, critRate = 5, critDmg = 50))
    object Amplifier : CharacterRole(Stats(hp = 1000, shld = 0, def = 300, atk = 580, stg = 0, critRate = 5, critDmg = 50))
    object Supporter : CharacterRole(Stats(hp = 1000, shld = 0, def = 300, atk = 580, stg = 0, critRate = 5, critDmg = 50))
    object Healer : CharacterRole(Stats(hp = 1000, shld = 0, def = 300, atk = 580, stg = 0, critRate = 5, critDmg = 50))
    object Defender : CharacterRole(Stats(hp = 1500, shld = 200, def = 500, atk = 300, stg = 0, critRate = 2, critDmg = 25))
}