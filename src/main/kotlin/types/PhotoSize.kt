package types

import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable

@Serializable
data class PhotoSize(
    val file_id: String,
    val file_unique_id: String,
    val width: Int,
    val height: Int,
    val file_size: Int? = null
)