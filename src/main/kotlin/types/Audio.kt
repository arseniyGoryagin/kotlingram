package types

import kotlinx.serialization.Serializable

@Serializable
data class Audio(
    val file_id: String,
    val file_unique_id: String,
    val duration: Int,
    val performer: String? = null,
    val title: String? = null,
    val file_name: String? = null,
    val mime_type: String? = null,
    val file_size: Int? = null,
    val thumbnail: PhotoSize? = null
)