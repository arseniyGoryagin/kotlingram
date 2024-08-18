package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InputPollOption(
    val text: String,
    @SerialName("text_parse_mode") val textParseMode: String? = null,
    @SerialName("text_entities") val textEntities: List<MessageEntity>? = null
)