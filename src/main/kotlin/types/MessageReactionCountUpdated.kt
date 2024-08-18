package types

import kotlinx.serialization.Serializable

@Serializable
data class MessageReactionCountUpdated(
    val chat: Chat,
    val message_id: Long,
    val date: Int,
    val reactions: List<ReactionCount>
)