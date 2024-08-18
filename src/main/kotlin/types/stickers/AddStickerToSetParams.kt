package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AddStickerToSetParams(
    @SerialName("user_id") val userId: Int,
    val name: String,
    val sticker: InputSticker
)