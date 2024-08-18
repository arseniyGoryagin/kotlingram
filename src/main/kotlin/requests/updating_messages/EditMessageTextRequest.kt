package requests.updating_messages

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineKeyboardMarkup
import types.LinkPreviewOptions
import types.MessageEntity

/**
 * Use this method to edit text and game messages.
 * On success, if the edited message is not an inline message, the edited Message is returned,
 * otherwise True is returned.
 * Note that business messages that were not sent by the bot and do not contain an inline keyboard
 * can only be edited within 48 hours from the time they were sent.
 *
 * @property businessConnectionId Unique identifier of the business connection on behalf of which the message to be edited was sent.
 * @property chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername).
 * @property messageId Identifier of the message to edit.
 * @property inlineMessageId Identifier of the inline message.
 * @property text New text of the message, 1-4096 characters after entities parsing.
 * @property parseMode Mode for parsing entities in the message text.
 * @property entities A JSON-serialized list of special entities that appear in message text.
 * @property linkPreviewOptions Link preview generation options for the message.
 * @property replyMarkup A JSON-serialized object for an inline keyboard.
 */
@Serializable
data class EditMessageTextRequest(
    @SerialName("business_connection_id") val businessConnectionId: String? = null,
    @SerialName("chat_id") val chatId: String? = null,
    @SerialName("message_id") val messageId: Int? = null,
    @SerialName("inline_message_id") val inlineMessageId: String? = null,
    @SerialName("text") val text: String,
    @SerialName("parse_mode") val parseMode: String? = null,
    @SerialName("entities") val entities: List<MessageEntity>? = null,
    @SerialName("link_preview_options") val linkPreviewOptions: LinkPreviewOptions? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "editMessageText"
    }
}