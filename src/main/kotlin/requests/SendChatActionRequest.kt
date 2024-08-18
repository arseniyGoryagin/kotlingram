package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class SendChatActionRequest(
    @SerialName("business_connection_id") val businessConnectionId: String? = null,
    @SerialName("chat_id") val chatId: String,
    @SerialName("message_thread_id") val messageThreadId: Int? = null,
    @SerialName("action") val action: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "sendChatAction"
    }
}
