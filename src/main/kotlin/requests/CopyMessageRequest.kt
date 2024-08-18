package requests


import TelegramRequest
import kotlinx.serialization.Serializable
import types.MessageEntity
import types.ReplyMarkup
import types.ReplyParameters

@Serializable
data class CopyMessageRequest(
    val chat_id: String,
    val message_thread_id: Int? = null,
    val from_chat_id: String,
    val message_id: Int,
    val caption: String? = null,
    val parse_mode: String? = null,
    val caption_entities: List<MessageEntity>? = null,
    val show_caption_above_media: Boolean? = null,
    val disable_notification: Boolean? = null,
    val protect_content: Boolean? = null,
    val reply_parameters: ReplyParameters? = null,
    val reply_markup: ReplyMarkup? = null
) : TelegramRequest{
    override fun endpoint(): String {
        return "copyMessageRequest"
    }
}