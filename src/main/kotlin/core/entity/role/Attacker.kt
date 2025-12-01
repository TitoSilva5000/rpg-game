package core.entity.role

import core.entity.Stats

object Attacker : Role(
    name = "Attacker",
    baseStats = Stats(
        hp = 200,
        atk = 100,
        critRate = 10.0,
        critDmg = 65.0),
)