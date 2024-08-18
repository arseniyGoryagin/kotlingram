package types.stickers

import kotlinx.serialization.Serializable

@Serializable
data class SetStickerSetTitleParams(
    val name: String,
    val title: String
)