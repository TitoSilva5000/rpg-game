package core.exceptions

class InvalidStatException(
    message: String,
    type: ErrorType
) : RPGException(message, type)