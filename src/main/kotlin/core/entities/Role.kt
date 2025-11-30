package core.entities

// Keep generic data here that BOTH enemies and players have
abstract class Role(
    val name: String,
    val baseStats: Stats
) {
    // You can add shared functions here, like calculateDefense()
}