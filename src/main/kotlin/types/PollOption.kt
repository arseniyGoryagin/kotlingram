package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PollOption(
    val text: String,
    @SerialName("text_entities") val textEntities: List<MessageEntity>? = null,
    @SerialName("voter_count") val voterCount: Long
)