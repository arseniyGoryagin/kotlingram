package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChatShared(
    @SerialName("request_id") val requestId: Int,
    @SerialName("chat_id") val chatId: Long,
    @SerialName("title") val title: String? = null,
    @SerialName("username") val username: String? = null,
    @SerialName("photo") val photo: List<PhotoSize>? = null
)