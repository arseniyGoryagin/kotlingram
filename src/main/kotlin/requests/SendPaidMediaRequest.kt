package requests

import TelegramRequest
import kotlinx.serialization.Serializable
import types.InputPaidMedia
import types.MessageEntity
import types.ReplyMarkup
import types.ReplyParameters

@Serializable
data class SendPaidMediaRequest(
    val business_connection_id: String? = null,
    val chat_id: String,
    val star_count: Int,
    val media: List<InputPaidMedia>,
    val caption: String? = null,
    val parse_mode: String? = null,
    val caption_entities: List<MessageEntity>? = null,
    val show_caption_above_media: Boolean? = null,
    val disable_notification: Boolean? = null,
    val protect_content: Boolean? = null,
    val reply_parameters: ReplyParameters? = null,
    val reply_markup: ReplyMarkup? = null
):  TelegramRequest{
    override fun endpoint(): String {
        return "sendPaidMediaRequest"
    }
}