package requests

import TelegramRequest
import kotlinx.serialization.Serializable

@Serializable
data class ForwardMessageRequest(
    val chat_id: String, // Can be Integer or String, using String for flexibility
    val message_thread_id: Int? = null,
    val from_chat_id: String, // Can be Integer or String, using String for flexibility
    val disable_notification: Boolean? = null,
    val protect_content: Boolean? = null,
    val message_id: Int
) : TelegramRequest{
    override fun endpoint(): String {
        return "forwardMessageRequest"
    }
}