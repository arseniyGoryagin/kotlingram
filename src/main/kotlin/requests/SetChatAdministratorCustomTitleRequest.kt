package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SetChatAdministratorCustomTitleRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("user_id") val userId: Int,
    @SerialName("custom_title") val customTitle: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "setChatAdministratorCustomTitle"
    }
}