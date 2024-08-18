package requests

import TelegramRequest
import kotlinx.serialization.Serializable

@Serializable
data class CopyMessagesRequest(
    val chat_id: String,
    val message_thread_id: Int? = null,
    val from_chat_id: String,
    val message_ids: List<Int>,
    val disable_notification: Boolean? = null,
    val protect_content: Boolean? = null,
    val remove_caption: Boolean? = null
) : TelegramRequest{
    override fun endpoint(): String {
        return "copyMessagesRequest"
    }
}