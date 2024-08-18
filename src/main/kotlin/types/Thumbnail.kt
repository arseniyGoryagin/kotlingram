package types

import kotlinx.serialization.Serializable

@Serializable
data class Thumbnail(
    val file_unique_id: String,
    val file_id: String,
    val width: Int,
    val file_size: Int,
    val height: Int
)