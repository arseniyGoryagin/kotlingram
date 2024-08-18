package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class GetStickerSetParams(
    val name: String
)