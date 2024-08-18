package requests

import TelegramRequest
import kotlinx.serialization.Serializable

@Serializable
data class ForwardMessagesRequest(
    val chat_id: String,
    val message_thread_id: Int? = null,
    val from_chat_id: String,
    val message_ids: List<Int>,
    val disable_notification: Boolean? = null,
    val protect_content: Boolean? = null
) : TelegramRequest{
    override fun endpoint(): String {
        return "forwardMessagesRequest"
    }
}