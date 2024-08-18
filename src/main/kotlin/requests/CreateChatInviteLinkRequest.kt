package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CreateChatInviteLinkRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("name") val name: String? = null,
    @SerialName("expire_date") val expireDate: Int? = null,
    @SerialName("member_limit") val memberLimit: Int? = null,
    @SerialName("creates_join_request") val createsJoinRequest: Boolean? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "createChatInviteLink"
    }
}