package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class InputMessageContent(
    @SerialName("message_text") val messageText: String,
    @SerialName("parse_mode") val parseMode: String? = null,
    @SerialName("entities") val entities: List<MessageEntity>? = null
)