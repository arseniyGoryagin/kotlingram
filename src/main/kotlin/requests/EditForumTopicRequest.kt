package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to edit name and icon of a topic in a forum supergroup chat.
 * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
 * Returns True on success.
 *
 * @property chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername).
 * @property messageThreadId Unique identifier for the target message thread of the forum topic.
 * @property name New topic name, 0-128 characters.
 * @property iconCustomEmojiId New unique identifier of the custom emoji shown as the topic icon.
 */
@Serializable
data class EditForumTopicRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("message_thread_id") val messageThreadId: Int,
    @SerialName("name") val name: String? = null,
    @SerialName("icon_custom_emoji_id") val iconCustomEmojiId: String? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "editForumTopic"
    }
}