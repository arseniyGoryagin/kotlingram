package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to change the bot's description, which is shown in the chat with the bot if the chat is empty.
 * Returns True on success.
 *
 * @property description New bot description; 0-512 characters. Pass an empty string to remove the dedicated description for the given language.
 * @property languageCode A two-letter ISO 639-1 language code. If empty, the description will be applied to all users for whose language there is no dedicated description.
 */
@Serializable
data class SetMyDescriptionRequest(
    @SerialName("description") val description: String? = null,
    @SerialName("language_code") val languageCode: String? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "setMyDescription"
    }
}