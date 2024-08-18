package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InputFile

@Serializable
data class SetChatPhotoRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("photo") val photo: InputFile
) : TelegramRequest {
    override fun endpoint(): String {
        return "setChatPhoto"
    }
}