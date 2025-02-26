package types

import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable

@Serializable
data class Voice(
    val file_id: String,
    val file_unique_id: String,
    val duration: Int,
    val mime_type: String? = null,
    val file_size: Int? = null
)