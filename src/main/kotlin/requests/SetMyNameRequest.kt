package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to change the bot's name.
 * Returns True on success.
 *
 * @property name New bot name; 0-64 characters. Pass an empty string to remove the dedicated name for the given language.
 * @property languageCode A two-letter ISO 639-1 language code. If empty, the name will be shown to all users for whose language there is no dedicated name.
 */
@Serializable
data class SetMyNameRequest(
    @SerialName("name") val name: String? = null,
    @SerialName("language_code") val languageCode: String? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "setMyName"
    }
}