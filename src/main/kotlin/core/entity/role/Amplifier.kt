package core.entity.role

import core.entity.Stats

object Amplifier : Role(
    name = "Amplifier",
    baseStats = Stats(
        atk = 100,
        critDmg = 80.0),
)