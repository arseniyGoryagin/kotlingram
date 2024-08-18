package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to get the list of boosts added to a chat by a user.
 * Requires administrator rights in the chat. Returns a UserChatBoosts object.
 *
 * @property chatId Unique identifier for the chat or username of the channel (in the format @channelusername).
 * @property userId Unique identifier of the target user.
 */
@Serializable
data class GetUserChatBoostsRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("user_id") val userId: Int
) : TelegramRequest {
    override fun endpoint(): String {
        return "getUserChatBoosts"
    }
}