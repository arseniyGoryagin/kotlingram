package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserProfilePhotos(
    @SerialName("total_count") val totalCount: Long,
    @SerialName("photos") val photos: List<List<PhotoSize>>
)