package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to send answers to callback queries sent from inline keyboards.
 * The answer will be displayed to the user as a notification at the top of the chat screen or as an alert.
 * On success, True is returned.
 *
 * @property callbackQueryId Unique identifier for the query to be answered.
 * @property text Text of the notification. If not specified, nothing will be shown to the user.
 * @property showAlert If True, an alert will be shown by the client instead of a notification at the top of the chat screen.
 * @property url URL that will be opened by the user's client.
 * @property cacheTime The maximum amount of time in seconds that the result of the callback query may be cached client-side.
 */
@Serializable
data class AnswerCallbackQueryRequest(
    @SerialName("callback_query_id") val callbackQueryId: String,
    @SerialName("text") val text: String? = null,
    @SerialName("show_alert") val showAlert: Boolean? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("cache_time") val cacheTime: Int? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "answerCallbackQuery"
    }
}