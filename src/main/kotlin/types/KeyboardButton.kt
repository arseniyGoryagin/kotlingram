package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class KeyboardButton(
    @SerialName("text") val text: String,
    @SerialName("request_users") val requestUsers: KeyboardButtonRequestUsers? = null,
    @SerialName("request_chat") val requestChat: KeyboardButtonRequestChat? = null,
    @SerialName("request_contact") val requestContact: Boolean? = null,
    @SerialName("request_location") val requestLocation: Boolean? = null,
    @SerialName("request_poll") val requestPoll: KeyboardButtonPollType? = null,
    @SerialName("web_app") val webApp: WebAppInfo? = null
)