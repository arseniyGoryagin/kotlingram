package types

import kotlinx.serialization.Serializable
import types.stickers.Sticker

@Serializable
data class BusinessIntro(
    val title: String? = null,
    val message: String? = null,
    val sticker:    Sticker? = null
)