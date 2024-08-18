package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetUserProfilePhotosRequest(
    @SerialName("user_id") val userId: Int,
    @SerialName("offset") val offset: Int? = null,
    @SerialName("limit") val limit: Int? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "getUserProfilePhotos"
    }
}