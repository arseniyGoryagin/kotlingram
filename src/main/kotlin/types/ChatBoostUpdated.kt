package types

import kotlinx.serialization.Serializable

@Serializable
data class ChatBoostUpdated(
    val chat: Chat,
    val boost: ChatBoost
)