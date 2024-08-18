package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to clear the list of pinned messages in a chat.
 * If the chat is not a private chat, the bot must be an administrator in the chat
 * for this to work and must have the 'can_pin_messages' administrator right in a
 * supergroup or 'can_edit_messages' administrator right in a channel.
 * Returns True on success.
 *
 * @property chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername).
 */
@Serializable
data class UnpinAllChatMessagesRequest(
    @SerialName("chat_id") val chatId: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "unpinAllChatMessages"
    }
}