package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChatBoostAdded(
    @SerialName("boost_count") val boostCount: Int
)