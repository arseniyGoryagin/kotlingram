package types

import kotlinx.serialization.Serializable

@Serializable
data class ResponseParameters(
    val migrate_to_chat_id: Long? = null,
    val retry_after: Int? = null
)