package core

import core.entity.Entity

data class Player(val team: MutableList<Entity> = mutableListOf()) {
    init {
        require(team.size in 1..4) { InvalidTeam}
    }
}