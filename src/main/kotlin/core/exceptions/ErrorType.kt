package core.exceptions

/**
 * Enum representing different types of error levels for exceptions in the Reversi game.
 */
enum class ErrorType(val level: String) {
    ERROR("ERROR");

    companion object {
        fun Exception.toRPGException(type: ErrorType): RPGException {
            return object : RPGException(
                message = message ?: "An unknown error occurred.",
                type = type
            ) {}
        }
    }
}