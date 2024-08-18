package types

import kotlinx.serialization.Serializable

@Serializable
data class BotDescription(
    val description: String
)