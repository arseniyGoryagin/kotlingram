package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method for your bot to leave a group, supergroup or channel.
 * Returns True on success.
 *
 * @property chatId Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername).
 */
@Serializable
data class LeaveChatRequest(
    @SerialName("chat_id") val chatId: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "leaveChat"
    }
}