package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.BotCommandScope

/**
 * Use this method to get the current list of the bot's commands for the given scope and user language.
 * Returns an Array of BotCommand objects.
 *
 * @property scope A JSON-serialized object, describing scope of users.
 * @property languageCode A two-letter ISO 639-1 language code or an empty string.
 */
@Serializable
data class GetMyCommandsRequest(
    @SerialName("scope") val scope: BotCommandScope? = null,
    @SerialName("language_code") val languageCode: String? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "getMyCommands"
    }
}