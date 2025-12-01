package core.entity.role

import core.entity.Stats

object Supporter : Role(
    name = "Supporter",
    baseStats = Stats(
        hp = 150,
        atk = 100,
        critDmg = 65.0),
)