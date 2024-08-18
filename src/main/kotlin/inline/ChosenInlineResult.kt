package inline

import User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.Location

/**
 * Represents a result of an inline query that was chosen by the user and sent to their chat partner.
 *
 * @property resultId The unique identifier for the result that was chosen
 * @property from The user that chose the result
 * @property location Optional. Sender location, only for bots that require user location
 * @property inlineMessageId Optional. Identifier of the sent inline message. Available only if there is an inline keyboard attached to the message.
 * @property query The query that was used to obtain the result
 */
@Serializable
data class ChosenInlineResult(
    @SerialName("result_id") val resultId: String,
    @SerialName("from") val from: User,
    @SerialName("location") val location: Location? = null,
    @SerialName("inline_message_id") val inlineMessageId: String? = null,
    @SerialName("query") val query: String
)
