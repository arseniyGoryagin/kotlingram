package types

import User
import kotlinx.serialization.Serializable

@Serializable
data class ChatInviteLink(
    val invite_link: String,
    val creator: User,
    val creates_join_request: Boolean,
    val is_primary: Boolean,
    val is_revoked: Boolean,
    val name: String? = null,
    val expire_date: Int? = null,
    val member_limit: Int? = null,
    val pending_join_request_count: Int? = null
)