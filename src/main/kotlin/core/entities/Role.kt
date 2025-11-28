package core.entities

enum class Role (
    val stats: Stats
) {
    ATTACKER(Stats(hp = 1000, shld = 0, def = 300, atk = 580, stg = 0, critRate = 5, critDmg = 50)),
    AMPLIFIER(Stats(hp = 1000, shld = 0, def = 300, atk = 580, stg = 0, critRate = 5, critDmg = 50)),
    SUPPORTER(Stats(hp = 1000, shld = 0, def = 300, atk = 580, stg = 0, critRate = 5, critDmg = 50)),
    HEALER(Stats(hp = 1000, shld = 0, def = 300, atk = 580, stg = 0, critRate = 5, critDmg = 50)),
    DEFENDER(Stats(hp = 1500, shld = 200, def = 500, atk = 300, stg = 0, critRate = 2, critDmg = 25)),
    ENEMY_BASIC(Stats()),
    ENEMY_ELITE(Stats()),
    ENEMY_BOSS(Stats())
}