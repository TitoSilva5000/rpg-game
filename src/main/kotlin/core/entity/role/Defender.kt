package core.entity.role

import core.entity.Stats

object Defender : Role(
    name = "Defender",
    baseStats = Stats(
        hp = 150,
        shld = 200,
        def = 100,
    )
)