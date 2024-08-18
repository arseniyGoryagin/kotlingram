package requests

import TelegramRequest
import kotlinx.serialization.Serializable
import types.MessageEntity
import types.ReplyMarkup
import types.ReplyParameters

@Serializable
data class SendAudioRequest(
    val business_connection_id: String? = null,
    val chat_id: String,
    val message_thread_id: Int? = null,
    val audio: String, // InputFile or String
    val caption: String? = null,
    val parse_mode: String? = null,
    val caption_entities: List<MessageEntity>? = null,
    val duration: Int? = null,
    val performer: String? = null,
    val title: String? = null,
    val thumbnail: String? = null,
    val disable_notification: Boolean? = null,
    val protect_content: Boolean? = null,
    val message_effect_id: String? = null,
    val reply_parameters: ReplyParameters? = null,
    val reply_markup: ReplyMarkup? = null
) :  TelegramRequest{
    override fun endpoint(): String {
        return "sendAudioRequest"
    }
}