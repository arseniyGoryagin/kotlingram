package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SetChatTitleRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("title") val title: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "setChatTitle"
    }
}