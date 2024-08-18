package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class SetStickerPositionInSetParams(
    val sticker: String,
    val position: Int
)