package types

import User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoChatParticipantsInvited(
    @SerialName("users") val users: List<User>
)