package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable



@Serializable
data class MaskPosition(
    val point: String,
    @SerialName("x_shift") val xShift: Float,
    @SerialName("y_shift") val yShift: Float,
    val scale: Float
)