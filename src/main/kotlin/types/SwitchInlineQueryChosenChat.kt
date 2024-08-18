package types

import kotlinx.serialization.Serializable

@Serializable
data class SwitchInlineQueryChosenChat(
    val query: String? = null,
    val allow_user_chats: Boolean? = null,
    val allow_bot_chats: Boolean? = null,
    val allow_group_chats: Boolean? = null,
    val allow_channel_chats: Boolean? = null
)
