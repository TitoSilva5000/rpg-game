package core.entities.characters.healers

import core.entities.Stats
import core.entities.characters.CharacterRole

class Healer : CharacterRole(
    name = "Healer",
    stats = Stats(
        hp = 1000,
        shld = 0,
        def = 300,
        atk = 580,
        stg = 0,
        critRate = 5,
        critDmg = 50),
)