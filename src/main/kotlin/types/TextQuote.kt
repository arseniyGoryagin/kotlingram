package types

import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable

@Serializable
data class TextQuote(
    val text: String,
    val entities: List<MessageEntity>? = null,
    val position: Int,
    val is_manual: Boolean? = null
)