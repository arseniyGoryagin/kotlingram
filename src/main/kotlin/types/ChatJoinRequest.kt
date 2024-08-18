package types

import User
import kotlinx.serialization.Serializable

@Serializable
data class ChatJoinRequest(
    val chat: Chat,
    val from: User,
    val user_chat_id: Long,
    val date: Int,
    val bio: String? = null,
    val invite_link: ChatInviteLink? = null
)