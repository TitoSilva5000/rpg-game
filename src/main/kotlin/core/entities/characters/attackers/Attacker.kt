package core.entities.characters.attackers

import core.entities.Stats
import core.entities.characters.CharacterRole

class Attacker : CharacterRole(
    name = "Attacker",
    stats = Stats(
        hp = 1000,
        shld = 0,
        def = 300,
        atk = 580,
        stg = 0,
        critRate = 5,
        critDmg = 50),
)