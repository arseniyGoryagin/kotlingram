package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SharedUser(
    @SerialName("user_id") val userId: Long,
    @SerialName("first_name") val firstName: String? = null,
    @SerialName("last_name") val lastName: String? = null,
    @SerialName("username") val username: String? = null,
    @SerialName("photo") val photo: List<PhotoSize>? = null
)