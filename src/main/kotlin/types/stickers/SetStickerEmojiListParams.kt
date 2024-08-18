package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class SetStickerEmojiListParams(
    val sticker: String,
    @SerialName("emoji_list") val emojiList: List<String>
)