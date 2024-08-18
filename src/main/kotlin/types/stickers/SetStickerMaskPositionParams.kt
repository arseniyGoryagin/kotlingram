package types.stickers

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SetStickerMaskPositionParams(
    val sticker: String,
    @SerialName("mask_position") val maskPosition: MaskPosition? = null
)
