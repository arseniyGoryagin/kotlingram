package requests

import TelegramRequest
import kotlinx.serialization.Serializable
import types.LinkPreviewOptions
import types.MessageEntity
import types.ReplyMarkup
import types.ReplyParameters

@Serializable
data class SendMessageRequest(
    val business_connection_id: String? = null,
    val chat_id: String, // Can be Integer or String, but using String for flexibility
    val message_thread_id: Int? = null,
    val text: String,
    val parse_mode: String? = null,
    val entities: List<MessageEntity>? = null,
    val link_preview_options: LinkPreviewOptions? = null,
    val disable_notification: Boolean? = null,
    val protect_content: Boolean? = null,
    val message_effect_id: String? = null,
    val reply_parameters: ReplyParameters? = null,
    val reply_markup: ReplyMarkup? = null // Use a sealed class or interface for different types
) : TelegramRequest{
    override fun endpoint(): String {
        return "sendMessage"
    }
}