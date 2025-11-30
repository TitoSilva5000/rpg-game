package core.entities.enemies.basic

import core.entities.Stats
import core.entities.enemies.EnemyRole

class Basic : EnemyRole(
    name = "Basic",
    stats = Stats(
        hp = 1000,
        shld = 0,
        def = 300,
        atk = 580,
        stg = 0,
        critRate = 5,
        critDmg = 50),
)