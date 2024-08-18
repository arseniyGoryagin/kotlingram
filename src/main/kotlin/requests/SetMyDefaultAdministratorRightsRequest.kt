package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.ChatAdministratorRights

/**
 * Use this method to change the default administrator rights requested by the bot when it's added as an administrator to groups or channels.
 * Returns True on success.
 *
 * @property rights A JSON-serialized object describing new default administrator rights. If not specified, the default administrator rights will be cleared.
 * @property forChannels Pass True to change the default administrator rights of the bot in channels.
 */
@Serializable
data class SetMyDefaultAdministratorRightsRequest(
    @SerialName("rights") val rights: ChatAdministratorRights? = null,
    @SerialName("for_channels") val forChannels: Boolean? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "setMyDefaultAdministratorRights"
    }
}