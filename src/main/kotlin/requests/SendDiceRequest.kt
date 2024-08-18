package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.ReplyMarkup
import types.ReplyParameters

@Serializable
data class SendDiceRequest(
    @SerialName("business_connection_id") val businessConnectionId: String? = null,
    @SerialName("chat_id") val chatId: String,
    @SerialName("message_thread_id") val messageThreadId: Int? = null,
    @SerialName("emoji") val emoji: String? = null,
    @SerialName("disable_notification") val disableNotification: Boolean? = null,
    @SerialName("protect_content") val protectContent: Boolean? = null,
    @SerialName("message_effect_id") val messageEffectId: String? = null,
    @SerialName("reply_parameters") val replyParameters: ReplyParameters? = null,
    @SerialName("reply_markup") val replyMarkup: ReplyMarkup? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "sendDice"
    }
}