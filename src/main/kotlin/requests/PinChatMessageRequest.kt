package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * Use this method to add a message to the list of pinned messages in a chat.
 * If the chat is not a private chat, the bot must be an administrator in the chat
 * for this to work and must have the 'can_pin_messages' administrator right in a
 * supergroup or 'can_edit_messages' administrator right in a channel.
 * Returns True on success.
 *
 * @property businessConnectionId Unique identifier of the business connection on behalf of which the message will be pinned.
 * @property chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername).
 * @property messageId Identifier of a message to pin.
 * @property disableNotification Pass True if it is not necessary to send a notification to all chat members about the new pinned message.
 */
@Serializable
data class PinChatMessageRequest(
    @SerialName("business_connection_id") val businessConnectionId: String? = null,
    @SerialName("chat_id") val chatId: String,
    @SerialName("message_id") val messageId: Int,
    @SerialName("disable_notification") val disableNotification: Boolean? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "pinChatMessage"
    }
}