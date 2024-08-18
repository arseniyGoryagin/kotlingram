package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DeleteStickerFromSetParams(
    val sticker: String
)
