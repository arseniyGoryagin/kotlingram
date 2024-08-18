package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to get the current bot short description for the given user language.
 * Returns BotShortDescription on success.
 *
 * @property languageCode A two-letter ISO 639-1 language code or an empty string.
 */
@Serializable
data class GetMyShortDescriptionRequest(
    @SerialName("language_code") val languageCode: String? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "getMyShortDescription"
    }
}