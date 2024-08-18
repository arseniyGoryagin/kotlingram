package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.*

@Serializable
data class SendPollRequest(
    @SerialName("business_connection_id") val businessConnectionId: String? = null,
    @SerialName("chat_id") val chatId: String,
    @SerialName("message_thread_id") val messageThreadId: Int? = null,
    @SerialName("question") val question: String,
    @SerialName("question_parse_mode") val questionParseMode: String? = null,
    @SerialName("question_entities") val questionEntities: List<MessageEntity>? = null,
    @SerialName("options") val options: List<InputPollOption>,
    @SerialName("is_anonymous") val isAnonymous: Boolean? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("allows_multiple_answers") val allowsMultipleAnswers: Boolean? = null,
    @SerialName("correct_option_id") val correctOptionId: Int? = null,
    @SerialName("explanation") val explanation: String? = null,
    @SerialName("explanation_parse_mode") val explanationParseMode: String? = null,
    @SerialName("explanation_entities") val explanationEntities: List<MessageEntity>? = null,
    @SerialName("open_period") val openPeriod: Int? = null,
    @SerialName("close_date") val closeDate: Int? = null,
    @SerialName("is_closed") val isClosed: Boolean? = null,
    @SerialName("disable_notification") val disableNotification: Boolean? = null,
    @SerialName("protect_content") val protectContent: Boolean? = null,
    @SerialName("message_effect_id") val messageEffectId: String? = null,
    @SerialName("reply_parameters") val replyParameters: ReplyParameters? = null,
    @SerialName("reply_markup") val replyMarkup: ReplyMarkup? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "sendPoll"
    }
}
