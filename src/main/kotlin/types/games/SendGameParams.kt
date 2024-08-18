package types.games
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineKeyboardMarkup
import types.ReplyParameters


@Serializable
data class SendGameParams(
    @SerialName("business_connection_id") val businessConnectionId: String? = null,
    @SerialName("chat_id") val chatId: Int,
    @SerialName("message_thread_id") val messageThreadId: Int? = null,
    @SerialName("game_short_name") val gameShortName: String,
    @SerialName("disable_notification") val disableNotification: Boolean? = null,
    @SerialName("protect_content") val protectContent: Boolean? = null,
    @SerialName("message_effect_id") val messageEffectId: String? = null,
    @SerialName("reply_parameters") val replyParameters: ReplyParameters? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null
)