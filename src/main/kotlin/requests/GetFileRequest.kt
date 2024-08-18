package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetFileRequest(
    @SerialName("file_id") val fileId: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "getFile"
    }
}