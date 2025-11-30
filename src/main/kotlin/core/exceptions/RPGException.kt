package core.exceptions

/**
 * Base exception class for RPG game-related errors.
 *
 * @property type The type of error represented by this exception.
 * @param message The detail message for the exception.
 */
abstract class RPGException (
    message: String,
    val type: ErrorType
) : Exception(message)