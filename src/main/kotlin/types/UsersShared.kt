package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UsersShared(
    @SerialName("request_id") val requestId: Long,
    @SerialName("users") val users: List<SharedUser>
)