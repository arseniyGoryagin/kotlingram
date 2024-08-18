package requests.updating_messages

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to delete multiple messages simultaneously.
 * Returns True on success.
 *
 * @property chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername).
 * @property messageIds A JSON-serialized list of 1-100 identifiers of messages to delete.
 */
@Serializable
data class DeleteMessagesRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("message_ids") val messageIds: List<Int>
) : TelegramRequest {
    override fun endpoint(): String {
        return "deleteMessages"
    }
}