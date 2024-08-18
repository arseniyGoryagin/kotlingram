package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to get the current default administrator rights of the bot.
 * Returns ChatAdministratorRights on success.
 *
 * @property forChannels Pass True to get default administrator rights of the bot in channels.
 */
@Serializable
data class GetMyDefaultAdministratorRightsRequest(
    @SerialName("for_channels") val forChannels: Boolean? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "getMyDefaultAdministratorRights"
    }
}