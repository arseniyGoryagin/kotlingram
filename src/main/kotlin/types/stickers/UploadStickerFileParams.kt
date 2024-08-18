package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UploadStickerFileParams(
    @SerialName("user_id") val userId: Int,
    val sticker: String,
    @SerialName("sticker_format") val stickerFormat: String
)
