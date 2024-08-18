package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to get up-to-date information about the chat.
 * Returns a ChatFullInfo object on success.
 *
 * @property chatId Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername).
 */
@Serializable
data class GetChatRequest(
    @SerialName("chat_id") val chatId: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "getChat"
    }
}