package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.PhotoSize


@Serializable
data class StickerSet(
    val name: String,
    val title: String,
    @SerialName("sticker_type") val stickerType: String,
    val stickers: List<Sticker>,
    val thumbnail: PhotoSize? = null
)