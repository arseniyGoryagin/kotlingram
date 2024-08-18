package requests

import TelegramRequest
import kotlinx.serialization.Serializable
import types.ReplyMarkup
import types.ReplyParameters

@Serializable
data class SendLocationRequest(
    val business_connection_id: String? = null,
    val chat_id: String,
    val message_thread_id: Int? = null,
    val latitude: Float,
    val longitude: Float,
    val horizontal_accuracy: Float? = null,
    val live_period: Int? = null,
    val heading: Int? = null,
    val proximity_alert_radius: Int? = null,
    val disable_notification: Boolean? = null,
    val protect_content: Boolean? = null,
    val message_effect_id: String? = null,
    val reply_parameters: ReplyParameters? = null,
    val reply_markup: ReplyMarkup? = null
)  :  TelegramRequest{
    override fun endpoint(): String {
        return "sendLocationRequest"
    }
}