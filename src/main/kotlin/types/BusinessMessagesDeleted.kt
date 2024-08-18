package types

import kotlinx.serialization.Serializable

@Serializable
data class BusinessMessagesDeleted(
    val business_connection_id: String,
    val chat: Chat,
    val message_ids: List<Int>
)