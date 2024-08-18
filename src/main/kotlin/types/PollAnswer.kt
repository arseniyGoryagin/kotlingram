package types

import User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PollAnswer(
    @SerialName("poll_id") val pollId: String,
    @SerialName("voter_chat") val voterChat: Chat? = null,
    @SerialName("user") val user: User? = null,
    @SerialName("option_ids") val optionIds: List<Long>
)