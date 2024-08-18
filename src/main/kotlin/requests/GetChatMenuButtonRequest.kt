package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to get the current value of the bot's menu button in a private chat, or the default menu button.
 * Returns MenuButton on success.
 *
 * @property chatId Unique identifier for the target private chat. If not specified, default bot's menu button will be returned.
 */
@Serializable
data class GetChatMenuButtonRequest(
    @SerialName("chat_id") val chatId: Int? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "getChatMenuButton"
    }
}