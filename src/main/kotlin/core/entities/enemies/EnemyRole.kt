package core.entities.enemies

import core.entities.Stats
import core.entities.Role

open class EnemyRole(name: String, stats: Stats) : Role(name, stats)

//sealed class EnemyRole(stats: Stats) : Role(stats) {
//    object Basic : EnemyRole(Stats())
//    object Elite : EnemyRole(Stats())
//    object Boss : EnemyRole(Stats())
//}