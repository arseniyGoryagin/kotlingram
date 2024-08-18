package types

import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable

@Serializable
data class Story(
    val chat: Chat,
    val id: Long
)
