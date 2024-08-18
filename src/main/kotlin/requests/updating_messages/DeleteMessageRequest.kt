package requests.updating_messages

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to delete a message, including service messages.
 * Returns True on success.
 *
 * @property chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername).
 * @property messageId Identifier of the message to delete.
 */
@Serializable
data class DeleteMessageRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("message_id") val messageId: Int
) : TelegramRequest {
    override fun endpoint(): String {
        return "deleteMessage"
    }
}