package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InputSticker(
    val sticker: String,
    val format: String,
    @SerialName("emoji_list") val emojiList: List<String>,
    @SerialName("mask_position") val maskPosition: MaskPosition? = null,
    val keywords: List<String>? = null
)