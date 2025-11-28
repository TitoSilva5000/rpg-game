package core.entities

data class Entity (
    val name: String,
    val level: Int,
    private val role: Role,
    private val baseStats: Stats = Stats(),
    val stats: Stats = baseStats + role.stats
) {

    init {
        require(level in 1..100) {
            "level must be between 1 and 100"
        }
    }

    fun updateStats(stats: Stats): Entity {
        return this.copy(stats = stats)
    }
}