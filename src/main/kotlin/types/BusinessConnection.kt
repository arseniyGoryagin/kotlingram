package types

import User
import kotlinx.serialization.Serializable

@Serializable
data class BusinessConnection(
    val id: String,
    val user: User,
    val user_chat_id: Long,
    val date: Int,
    val can_reply: Boolean,
    val is_enabled: Boolean
)