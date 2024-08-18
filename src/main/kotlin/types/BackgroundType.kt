package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class BackgroundType {
    @Serializable
    @SerialName("fill")
    data class BackgroundTypeFill(
        val fill: BackgroundFill,
        @SerialName("dark_theme_dimming") val darkThemeDimming: Int
    ) : BackgroundType()

    @Serializable
    @SerialName("wallpaper")
    data class BackgroundTypeWallpaper(
        val document: Document,
        @SerialName("dark_theme_dimming") val darkThemeDimming: Int,
        @SerialName("is_blurred") val isBlurred: Boolean? = null,
        @SerialName("is_moving") val isMoving: Boolean? = null
    ) : BackgroundType()

    @Serializable
    @SerialName("pattern")
    data class BackgroundTypePattern(
        val document: Document,
        val fill: BackgroundFill,
        val intensity: Int,
        @SerialName("is_inverted") val isInverted: Boolean? = null,
        @SerialName("is_moving") val isMoving: Boolean? = null
    ) : BackgroundType()

    @Serializable
    @SerialName("chat_theme")
    data class BackgroundTypeChatTheme(
        @SerialName("theme_name") val themeName: String
    ) : BackgroundType()
}