package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class MenuButton {
    @Serializable
    @SerialName("commands")
    data class MenuButtonCommands(
        val type: String = "commands"
    ) : MenuButton()

    @Serializable
    @SerialName("web_app")
    data class MenuButtonWebApp(
        val type: String = "web_app",
        val text: String,
        val web_app: WebAppInfo
    ) : MenuButton()

    @Serializable
    @SerialName("default")
    data class MenuButtonDefault(
        val type: String = "default"
    ) : MenuButton()
}