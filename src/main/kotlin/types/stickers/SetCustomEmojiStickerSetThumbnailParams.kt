package types.stickers

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SetCustomEmojiStickerSetThumbnailParams(
    val name: String,
    @SerialName("custom_emoji_id") val customEmojiId: String? = null
)