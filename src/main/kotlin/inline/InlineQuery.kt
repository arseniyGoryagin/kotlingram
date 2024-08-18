package inline

import User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.Location

/**
 * This object represents an incoming inline query.
 * When the user sends an empty query, your bot could return some default or trending results.
 *
 * @property id Unique identifier for this query.
 * @property from Sender.
 * @property query Text of the query (up to 256 characters).
 * @property offset Offset of the results to be returned, can be controlled by the bot.
 * @property chatType Optional. Type of the chat from which the inline query was sent.
 * @property location Optional. Sender location, only for bots that request user location.
 */
@Serializable
data class InlineQuery(
    @SerialName("id") val id: String,
    @SerialName("from") val from: User,
    @SerialName("query") val query: String,
    @SerialName("offset") val offset: String,
    @SerialName("chat_type") val chatType: String? = null,
    @SerialName("location") val location: Location? = null
)