package core.entity.characters

import core.entity.Stats

class Defender : CharacterRole(
    name = "Defender",
    stats = Stats(
        hp = 150,
        shld = 200,
        def = 100,
    )
)