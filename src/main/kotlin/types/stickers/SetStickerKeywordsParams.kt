package types.stickers

import kotlinx.serialization.Serializable


@Serializable
data class SetStickerKeywordsParams(
    val sticker: String,
    val keywords: List<String>? = null
)