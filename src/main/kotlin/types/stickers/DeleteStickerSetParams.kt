package types.stickers

import kotlinx.serialization.Serializable

@Serializable
data class DeleteStickerSetParams(
    val name: String
)