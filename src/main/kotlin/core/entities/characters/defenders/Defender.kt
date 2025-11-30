package core.entities.characters.defenders

import core.entities.Stats
import core.entities.characters.CharacterRole

class Defender : CharacterRole(
    name = "Defender",
    stats = Stats(
        hp = 1500,
        shld = 200,
        def = 500,
        atk = 300,
        stg = 0,
        critRate = 2,
        critDmg = 25
    )
)