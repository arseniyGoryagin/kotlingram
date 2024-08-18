package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BanChatMemberRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("user_id") val userId: Int,
    @SerialName("until_date") val untilDate: Int? = null,
    @SerialName("revoke_messages") val revokeMessages: Boolean? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "banChatMember"
    }
}