package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to create a topic in a forum supergroup chat.
 * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
 * Returns information about the created topic as a ForumTopic object.
 *
 * @property chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername).
 * @property name Topic name, 1-128 characters.
 * @property iconColor Color of the topic icon in RGB format.
 * @property iconCustomEmojiId Unique identifier of the custom emoji shown as the topic icon.
 */
@Serializable
data class CreateForumTopicRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("name") val name: String,
    @SerialName("icon_color") val iconColor: Int? = null,
    @SerialName("icon_custom_emoji_id") val iconCustomEmojiId: String? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "createForumTopic"
    }
}