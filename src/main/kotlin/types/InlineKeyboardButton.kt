package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.games.CallbackGame

@Serializable
data class InlineKeyboardButton(
    @SerialName("text") val text: String,
    @SerialName("url") val url: String? = null,
    @SerialName("callback_data") val callbackData: String? = null,
    @SerialName("web_app") val webApp: WebAppInfo? = null,
    @SerialName("login_url") val loginUrl: LoginUrl? = null,
    @SerialName("switch_inline_query") val switchInlineQuery: String? = null,
    @SerialName("switch_inline_query_current_chat") val switchInlineQueryCurrentChat: String? = null,
    @SerialName("switch_inline_query_chosen_chat") val switchInlineQueryChosenChat: SwitchInlineQueryChosenChat? = null,
    @SerialName("callback_game") val callbackGame: CallbackGame? = null,
    @SerialName("pay") val pay: Boolean? = null
)