package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.MenuButton

/**
 * Use this method to change the bot's menu button in a private chat, or the default menu button.
 * Returns True on success.
 *
 * @property chatId Unique identifier for the target private chat. If not specified, default bot's menu button will be changed.
 * @property menuButton A JSON-serialized object for the bot's new menu button. Defaults to MenuButtonDefault.
 */
@Serializable
data class SetChatMenuButtonRequest(
    @SerialName("chat_id") val chatId: Int? = null,
    @SerialName("menu_button") val menuButton: MenuButton? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "setChatMenuButton"
    }
}