package types

import User
import kotlinx.serialization.Serializable

@Serializable
data class ChatMemberUpdated(
    val chat: Chat,
    val from: User,
    val date: Int,
    val old_chat_member: ChatMember,
    val new_chat_member: ChatMember,
    val invite_link: ChatInviteLink? = null,
    val via_join_request: Boolean? = null,
    val via_chat_folder_invite_link: Boolean? = null
)