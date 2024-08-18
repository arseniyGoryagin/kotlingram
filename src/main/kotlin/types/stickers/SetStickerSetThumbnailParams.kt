package types.stickers

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SetStickerSetThumbnailParams(
    val name: String,
    @SerialName("user_id") val userId: Int,
    val thumbnail: String? = null,
    val format: String
)