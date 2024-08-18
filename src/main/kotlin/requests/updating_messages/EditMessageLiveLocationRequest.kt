package requests.updating_messages

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineKeyboardMarkup

/**
 * Use this method to edit live location messages.
 * On success, if the edited message is not an inline message, the edited Message is returned,
 * otherwise True is returned.
 *
 * @property businessConnectionId Unique identifier of the business connection on behalf of which the message to be edited was sent.
 * @property chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername).
 * @property messageId Identifier of the message to edit.
 * @property inlineMessageId Identifier of the inline message.
 * @property latitude Latitude of new location.
 * @property longitude Longitude of new location.
 * @property livePeriod New period in seconds during which the location can be updated.
 * @property horizontalAccuracy The radius of uncertainty for the location, measured in meters.
 * @property heading Direction in which the user is moving, in degrees.
 * @property proximityAlertRadius The maximum distance for proximity alerts about approaching another chat member, in meters.
 * @property replyMarkup A JSON-serialized object for a new inline keyboard.
 */
@Serializable
data class EditMessageLiveLocationRequest(
    @SerialName("business_connection_id") val businessConnectionId: String? = null,
    @SerialName("chat_id") val chatId: String? = null,
    @SerialName("message_id") val messageId: Int? = null,
    @SerialName("inline_message_id") val inlineMessageId: String? = null,
    @SerialName("latitude") val latitude: Float,
    @SerialName("longitude") val longitude: Float,
    @SerialName("live_period") val livePeriod: Int? = null,
    @SerialName("horizontal_accuracy") val horizontalAccuracy: Float? = null,
    @SerialName("heading") val heading: Int? = null,
    @SerialName("proximity_alert_radius") val proximityAlertRadius: Int? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "editMessageLiveLocation"
    }
}