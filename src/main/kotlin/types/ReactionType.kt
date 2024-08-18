package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@kotlinx.serialization.Serializable
sealed class ReactionType {
    @Serializable
    @SerialName("emoji")
    data class ReactionTypeEmoji(
        val type: String = "emoji",
        val emoji: String
    ) : ReactionType()

    @Serializable
    @SerialName("custom_emoji")
    data class ReactionTypeCustomEmoji(
        val type: String = "custom_emoji",
        val custom_emoji_id: String
    ) : ReactionType()
}