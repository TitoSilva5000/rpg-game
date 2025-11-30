package core.entity.characters

import core.entity.Stats

class Attacker : CharacterRole(
    name = "Attacker",
    stats = Stats(
        hp = 200,
        atk = 100,
        critRate = 10.0,
        critDmg = 65.0),
)