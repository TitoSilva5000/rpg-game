package core.entities.roles

import core.entities.Stats

sealed class EnemyRole(stats: Stats) : Role(stats) {
    object Basic : EnemyRole(Stats())
    object Elite : EnemyRole(Stats())
    object Boss : EnemyRole(Stats())
}