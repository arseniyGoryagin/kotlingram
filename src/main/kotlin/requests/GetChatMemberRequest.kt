package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to get information about a member of a chat.
 * The method is only guaranteed to work for other users if the bot is an administrator in the chat.
 * Returns a ChatMember object on success.
 *
 * @property chatId Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername).
 * @property userId Unique identifier of the target user.
 */
@Serializable
data class GetChatMemberRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("user_id") val userId: Int
) : TelegramRequest {
    override fun endpoint(): String {
        return "getChatMember"
    }
}