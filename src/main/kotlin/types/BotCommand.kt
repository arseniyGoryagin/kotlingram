package types

import kotlinx.serialization.Serializable

@Serializable
data class BotCommand(
    val command: String,
    val description: String
)