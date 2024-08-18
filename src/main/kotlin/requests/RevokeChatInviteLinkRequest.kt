package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RevokeChatInviteLinkRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("invite_link") val inviteLink: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "revokeChatInviteLink"
    }
}