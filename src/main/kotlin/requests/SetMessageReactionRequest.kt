package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.ReactionType

@Serializable
data class SetMessageReactionRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("message_id") val messageId: Int,
    @SerialName("reaction") val reaction: List<ReactionType>? = null,
    @SerialName("is_big") val isBig: Boolean? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "setMessageReaction"
    }
}