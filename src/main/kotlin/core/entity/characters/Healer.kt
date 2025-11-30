package core.entity.characters

import core.entity.Stats

class Healer : CharacterRole(
    name = "Healer",
    stats = Stats(
        hp = 150,
    ),
)