package types

import User
import kotlinx.serialization.Serializable

@Serializable
data class MessageReactionUpdated(
    val chat: Chat,
    val message_id: Int,
    val user: User? = null,
    val actor_chat: Chat? = null,
    val date: Int,
    val old_reaction: List<ReactionType>,
    val new_reaction: List<ReactionType>
)