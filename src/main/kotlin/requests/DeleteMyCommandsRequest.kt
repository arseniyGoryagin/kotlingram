package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.BotCommandScope

/**
 * Use this method to delete the list of the bot's commands for the given scope and user language.
 * Returns True on success.
 *
 * @property scope A JSON-serialized object, describing scope of users for which the commands are relevant.
 * @property languageCode A two-letter ISO 639-1 language code. If empty, commands will be applied to all users from the given scope.
 */
@Serializable
data class DeleteMyCommandsRequest(
    @SerialName("scope") val scope: BotCommandScope? = null,
    @SerialName("language_code") val languageCode: String? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "deleteMyCommands"
    }
}