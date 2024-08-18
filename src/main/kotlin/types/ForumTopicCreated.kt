package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForumTopicCreated(
    val name: String,
    @SerialName("icon_color") val iconColor: Int,
    @SerialName("icon_custom_emoji_id") val iconCustomEmojiId: String? = null
)
