package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UnbanChatMemberRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("user_id") val userId: Int,
    @SerialName("only_if_banned") val onlyIfBanned: Boolean? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "unbanChatMember"
    }
}