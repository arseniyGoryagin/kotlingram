package types

import kotlinx.serialization.Serializable

@Serializable
data class BotShortDescription(
    val short_description: String
)