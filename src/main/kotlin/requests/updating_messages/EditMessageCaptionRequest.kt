package requests.updating_messages

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineKeyboardMarkup
import types.MessageEntity

/**
 * Use this method to edit captions of messages.
 * On success, if the edited message is not an inline message, the edited Message is returned,
 * otherwise True is returned.
 *
 * @property businessConnectionId Unique identifier of the business connection on behalf of which the message to be edited was sent.
 * @property chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername).
 * @property messageId Identifier of the message to edit.
 * @property inlineMessageId Identifier of the inline message.
 * @property caption New caption of the message, 0-1024 characters after entities parsing.
 * @property parseMode Mode for parsing entities in the message caption.
 * @property captionEntities A JSON-serialized list of special entities that appear in the caption.
 * @property showCaptionAboveMedia Pass True, if the caption must be shown above the message media.
 * @property replyMarkup A JSON-serialized object for an inline keyboard.
 */
@Serializable
data class EditMessageCaptionRequest(
    @SerialName("business_connection_id") val businessConnectionId: String? = null,
    @SerialName("chat_id") val chatId: String? = null,
    @SerialName("message_id") val messageId: Int? = null,
    @SerialName("inline_message_id") val inlineMessageId: String? = null,
    @SerialName("caption") val caption: String? = null,
    @SerialName("parse_mode") val parseMode: String? = null,
    @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
    @SerialName("show_caption_above_media") val showCaptionAboveMedia: Boolean? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "editMessageCaption"
    }
}