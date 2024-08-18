package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to clear the list of pinned messages in a forum topic.
 * The bot must be an administrator in the chat for this to work and must have the can_pin_messages administrator right in the supergroup.
 * Returns True on success.
 *
 * @property chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername).
 * @property messageThreadId Unique identifier for the target message thread of the forum topic.
 */
@Serializable
data class UnpinAllForumTopicMessagesRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("message_thread_id") val messageThreadId: Int
) : TelegramRequest {
    override fun endpoint(): String {
        return "unpinAllForumTopicMessages"
    }
}