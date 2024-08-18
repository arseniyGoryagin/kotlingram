package types

import User
import kotlinx.serialization.Serializable

@Serializable
data class CallbackQuery(
    val id: String,
    val from: User,
    val message: MaybeInaccessibleMessage? = null,
    val inline_message_id: String? = null,
    val chat_instance: String,
    val data: String? = null,
    val game_short_name: String? = null
)