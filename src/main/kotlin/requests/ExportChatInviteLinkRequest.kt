package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExportChatInviteLinkRequest(
    @SerialName("chat_id") val chatId: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "exportChatInviteLink"
    }
}