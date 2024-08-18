package types

import com.squareup.moshi.JsonClass
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable



@Serializable
data class Document(
    val file_id: String,
    @SerialName("file_unique_id") val fileUniqueId: String,
    val thumbnail: PhotoSize? = null,
    @SerialName("file_name")val fileName: String? = null,
    @SerialName("mime_type")val mimeType: String? = null,
    @SerialName("file_size") val fileSize: Int? = null,
    val thumb: Thumbnail? = null
)