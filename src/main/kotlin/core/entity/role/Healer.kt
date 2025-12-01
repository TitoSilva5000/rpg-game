package core.entity.role

import core.entity.Stats

object Healer : Role(
    name = "Healer",
    baseStats = Stats(
        hp = 150,
    ),
)