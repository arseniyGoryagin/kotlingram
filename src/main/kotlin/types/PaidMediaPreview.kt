package types

import kotlinx.serialization.Serializable

@Serializable
data class PaidMediaPreview(
    override val type: String = "preview",
    val width: Int? = null,
    val height: Int? = null,
    val duration: Int? = null
) : PaidMedia()