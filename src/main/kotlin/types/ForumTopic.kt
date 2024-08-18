package types

import kotlinx.serialization.Serializable

@Serializable
data class ForumTopic(
    val message_thread_id: Int,
    val name: String,
    val icon_color: Int,
    val icon_custom_emoji_id: String? = null
)