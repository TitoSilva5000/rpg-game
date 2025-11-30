package core.entities.enemies.boss

import core.entities.Stats
import core.entities.enemies.EnemyRole

class Boss : EnemyRole(
    name = "Boss",
    stats = Stats(
        hp = 1000,
        shld = 0,
        def = 300,
        atk = 580,
        stg = 0,
        critRate = 5,
        critDmg = 50),
)