package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class BackgroundFill {

    @Serializable
    @SerialName("solid")
    data class BackgroundFillSolid(
        val color: Int
    ) : BackgroundFill()

    @Serializable
    @SerialName("gradient")
    data class BackgroundFillGradient(
        @SerialName("top_color") val topColor: Int,
        @SerialName("bottom_color") val bottomColor: Int,
        @SerialName("rotation_angle") val rotationAngle: Int
    ) : BackgroundFill()

    @Serializable
    @SerialName("freeform_gradient")
    data class BackgroundFillFreeformGradient(
        val colors: List<Int>
    ) : BackgroundFill()
}