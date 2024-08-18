package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CreateNewStickerSetParams(
    @SerialName("user_id") val userId: Int,
    val name: String,
    val title: String,
    val stickers: List<InputSticker>,
    @SerialName("sticker_type") val stickerType: String? = null,
    @SerialName("needs_repainting") val needsRepainting: Boolean? = null
)