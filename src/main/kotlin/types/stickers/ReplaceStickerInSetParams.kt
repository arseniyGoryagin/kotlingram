package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ReplaceStickerInSetParams(
    @SerialName("user_id") val userId: Int,
    val name: String,
    @SerialName("old_sticker") val oldSticker: String,
    val sticker: InputSticker
)