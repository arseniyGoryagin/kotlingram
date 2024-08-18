package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.BotCommand
import types.BotCommandScope

/**
 * Use this method to change the list of the bot's commands.
 * Returns True on success.
 *
 * @property commands A JSON-serialized list of bot commands to be set as the list of the bot's commands.
 * At most 100 commands can be specified.
 * @property scope A JSON-serialized object, describing scope of users for which the commands are relevant.
 * @property languageCode A two-letter ISO 639-1 language code. If empty, commands will be applied to all users from the given scope.
 */
@Serializable
data class SetMyCommandsRequest(
    @SerialName("commands") val commands: List<BotCommand>,
    @SerialName("scope") val scope: BotCommandScope? = null,
    @SerialName("language_code") val languageCode: String? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "setMyCommands"
    }
}