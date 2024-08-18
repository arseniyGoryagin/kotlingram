package requests

import TelegramRequest
import kotlinx.serialization.Serializable
import types.ReplyMarkup
import types.ReplyParameters

@Serializable
data class SendVideoNoteRequest(
    val business_connection_id: String? = null,
    val chat_id: String,
    val message_thread_id: Int? = null,
    val video_note: String, // InputFile or String
    val duration: Int? = null,
    val length: Int? = null,
    val thumbnail: String? = null,
    val disable_notification: Boolean? = null,
    val protect_content: Boolean? = null,
    val message_effect_id: String? = null,
    val reply_parameters: ReplyParameters? = null,
    val reply_markup: ReplyMarkup? = null
)  :  TelegramRequest{
    override fun endpoint(): String {
        return "sendVideoNoteRequest"
    }
}