package types

import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable

@Serializable
data class Video(
    val file_id: String,
    val file_unique_id: String,
    val width: Int,
    val height: Int,
    val duration: Int,
    val thumbnail: PhotoSize? = null,
    val file_name: String? = null,
    val mime_type: String? = null,
    val file_size: Int? = null,

    // not documenetd

    val thumb : Thumbnail
)


