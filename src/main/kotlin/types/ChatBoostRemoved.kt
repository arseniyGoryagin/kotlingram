package types

import kotlinx.serialization.Serializable

@Serializable
data class ChatBoostRemoved(
    val chat: Chat,
    val boost_id: String,
    val remove_date: Int,
    val source: ChatBoostSource
)