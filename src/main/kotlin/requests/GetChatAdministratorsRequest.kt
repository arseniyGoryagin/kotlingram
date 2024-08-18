package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to get a list of administrators in a chat, which aren't bots.
 * Returns an Array of ChatMember objects.
 *
 * @property chatId Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername).
 */
@Serializable
data class GetChatAdministratorsRequest(
    @SerialName("chat_id") val chatId: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "getChatAdministrators"
    }
}