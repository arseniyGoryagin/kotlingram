package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InaccessibleMessage(
    @SerialName("chat") val chat: Chat,
    @SerialName("message_id") val messageId: Int,
    @SerialName("date") val date: Int
) : MaybeInaccessibleMessage()