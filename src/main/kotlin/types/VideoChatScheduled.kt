package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoChatScheduled(
    @SerialName("start_date") val startDate: Long
)