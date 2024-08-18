package types

import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable

@Serializable
data class VideoNote(
    val file_id: String,
    val file_unique_id: String,
    val length: Int,
    val duration: Int,
    val thumbnail: PhotoSize? = null,
    val file_size: Int? = null,
    val thumb: Thumbnail? = null
)