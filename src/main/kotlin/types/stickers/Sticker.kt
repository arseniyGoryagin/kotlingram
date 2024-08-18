package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.File
import types.PhotoSize

@Serializable
data class Sticker(
    @SerialName("file_id") val fileId: String,
    @SerialName("file_unique_id") val fileUniqueId: String,
    val type: String,
    val width: Int,
    val height: Int,
    @SerialName("is_animated") val isAnimated: Boolean,
    @SerialName("is_video") val isVideo: Boolean,
    val thumbnail: PhotoSize? = null,
    val emoji: String? = null,
    @SerialName("set_name") val setName: String? = null,
    @SerialName("premium_animation") val premiumAnimation: File? = null,
    @SerialName("mask_position") val maskPosition: MaskPosition? = null,
    @SerialName("custom_emoji_id") val customEmojiId: String? = null,
    @SerialName("needs_repainting") val needsRepainting: Boolean? = null,
    @SerialName("file_size") val fileSize: Int? = null
)
