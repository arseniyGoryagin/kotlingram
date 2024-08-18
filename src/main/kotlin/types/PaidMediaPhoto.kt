package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class PaidMediaPhoto(
    override val type: String = "photo",
    val photo: List<PhotoSize>
) : PaidMedia()