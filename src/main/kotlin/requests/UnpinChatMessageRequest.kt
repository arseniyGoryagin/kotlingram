package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to remove a message from the list of pinned messages in a chat.
 * If the chat is not a private chat, the bot must be an administrator in the chat
 * for this to work and must have the 'can_pin_messages' administrator right in a
 * supergroup or 'can_edit_messages' administrator right in a channel.
 * Returns True on success.
 *
 * @property businessConnectionId Unique identifier of the business connection on behalf of which the message will be unpinned.
 * @property chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername).
 * @property messageId Identifier of the message to unpin. Required if businessConnectionId is specified.
 */
@Serializable
data class UnpinChatMessageRequest(
    @SerialName("business_connection_id") val businessConnectionId: String? = null,
    @SerialName("chat_id") val chatId: String,
    @SerialName("message_id") val messageId: Int? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "unpinChatMessage"
    }
}