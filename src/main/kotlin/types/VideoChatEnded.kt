package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoChatEnded(
    @SerialName("duration") val duration: Int
)