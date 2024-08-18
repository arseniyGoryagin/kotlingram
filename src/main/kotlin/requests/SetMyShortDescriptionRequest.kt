package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to change the bot's short description, which is shown on the bot's profile page and is sent together with the link when users share the bot.
 * Returns True on success.
 *
 * @property shortDescription New short description for the bot; 0-120 characters. Pass an empty string to remove the dedicated short description for the given language.
 * @property languageCode A two-letter ISO 639-1 language code. If empty, the short description will be applied to all users for whose language there is no dedicated short description.
 */
@Serializable
data class SetMyShortDescriptionRequest(
    @SerialName("short_description") val shortDescription: String? = null,
    @SerialName("language_code") val languageCode: String? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "setMyShortDescription"
    }
}