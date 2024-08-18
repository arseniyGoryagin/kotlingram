package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SetChatDescriptionRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("description") val description: String? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "setChatDescription"
    }
}