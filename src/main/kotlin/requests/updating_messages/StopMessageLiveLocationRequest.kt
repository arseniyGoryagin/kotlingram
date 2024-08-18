package requests.updating_messages

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineKeyboardMarkup

/**
 * Use this method to stop updating a live location message before live_period expires.
 * On success, if the message is not an inline message, the edited Message is returned,
 * otherwise True is returned.
 *
 * @property businessConnectionId Unique identifier of the business connection on behalf of which the message to be edited was sent.
 * @property chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername).
 * @property messageId Identifier of the message with live location to stop.
 * @property inlineMessageId Identifier of the inline message.
 * @property replyMarkup A JSON-serialized object for a new inline keyboard.
 */
@Serializable
data class StopMessageLiveLocationRequest(
    @SerialName("business_connection_id") val businessConnectionId: String? = null,
    @SerialName("chat_id") val chatId: String? = null,
    @SerialName("message_id") val messageId: Int? = null,
    @SerialName("inline_message_id") val inlineMessageId: String? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "stopMessageLiveLocation"
    }
}