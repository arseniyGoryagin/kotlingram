package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * Use this method to reopen a closed 'General' topic in a forum supergroup chat.
 * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
 * Returns True on success.
 *
 * @property chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername).
 */
@Serializable
data class ReopenGeneralForumTopicRequest(
    @SerialName("chat_id") val chatId: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "reopenGeneralForumTopic"
    }
}
