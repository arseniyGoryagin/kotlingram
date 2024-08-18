package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to get information about the connection of the bot with a business account.
 * Returns a BusinessConnection object on success.
 *
 * @property businessConnectionId Unique identifier of the business connection.
 */
@Serializable
data class GetBusinessConnectionRequest(
    @SerialName("business_connection_id") val businessConnectionId: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "getBusinessConnection"
    }
}