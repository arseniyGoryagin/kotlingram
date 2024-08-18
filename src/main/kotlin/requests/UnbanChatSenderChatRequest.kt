package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class UnbanChatSenderChatRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("sender_chat_id") val senderChatId: Int
) : TelegramRequest {
    override fun endpoint(): String {
        return "unbanChatSenderChat"
    }
}