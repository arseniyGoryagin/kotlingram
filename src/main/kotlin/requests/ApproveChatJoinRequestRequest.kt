package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApproveChatJoinRequestRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("user_id") val userId: Int
) : TelegramRequest {
    override fun endpoint(): String {
        return "approveChatJoinRequest"
    }
}