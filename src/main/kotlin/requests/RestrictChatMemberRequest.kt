package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.ChatPermissions

@Serializable
data class RestrictChatMemberRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("user_id") val userId: Int,
    @SerialName("permissions") val permissions: ChatPermissions,
    @SerialName("use_independent_chat_permissions") val useIndependentChatPermissions: Boolean? = null,
    @SerialName("until_date") val untilDate: Int? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "restrictChatMember"
    }
}