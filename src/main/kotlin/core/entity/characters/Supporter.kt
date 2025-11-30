package core.entity.characters

import core.entity.Stats

class Supporter : CharacterRole(
    name = "Supporter",
    stats = Stats(
        hp = 150,
        atk = 100,
        critDmg = 65.0),
)