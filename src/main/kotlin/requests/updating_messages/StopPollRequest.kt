package requests.updating_messages

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineKeyboardMarkup

/**
 * Use this method to stop a poll which was sent by the bot.
 * On success, the stopped Poll is returned.
 *
 * @property businessConnectionId Unique identifier of the business connection on behalf of which the message to be edited was sent.
 * @property chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername).
 * @property messageId Identifier of the original message with the poll.
 * @property replyMarkup A JSON-serialized object for a new message inline keyboard.
 */
@Serializable
data class StopPollRequest(
    @SerialName("business_connection_id") val businessConnectionId: String? = null,
    @SerialName("chat_id") val chatId: String,
    @SerialName("message_id") val messageId: Int,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "stopPoll"
    }
}