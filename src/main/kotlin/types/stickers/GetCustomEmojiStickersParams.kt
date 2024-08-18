package types.stickers
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class GetCustomEmojiStickersParams(
    @SerialName("custom_emoji_ids") val customEmojiIds: List<String>
)