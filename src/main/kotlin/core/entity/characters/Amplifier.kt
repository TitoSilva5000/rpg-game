package core.entity.characters

import core.entity.Stats

class Amplifier : CharacterRole(
    name = "Amplifier",
    stats = Stats(
        atk = 100,
        critDmg = 80.0),
)