package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.ChatPermissions

@Serializable
data class SetChatPermissionsRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("permissions") val permissions: ChatPermissions,
    @SerialName("use_independent_chat_permissions") val useIndependentChatPermissions: Boolean? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "setChatPermissions"
    }
}