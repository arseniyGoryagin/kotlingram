package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InputMedia
import types.ReplyParameters



/**
 * Use this method to send a group of photos, videos, documents or audios as an album. Documents and audio files can be only grouped in an album with messages of the same type. On success, an array of Messages that were sent is returned.
 *
 * @property businessConnectionId Unique identifier of the business connection on behalf of which the message will be sent.
 * @property chatId Unique identifier of the target user.
 * @property messageThreadId Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
 * @property media A JSON-serialized array describing messages to be sent, must include 2-10 items
 * @property disableNotification Sends messages silently. Users will receive a notification with no sound.
 * @property protectContent Protects the contents of the sent messages from forwarding and saving
 * @property messageEffectId Unique identifier of the message effect to be added to the message; for private chats only
 * @property replyParameters Description of the message to reply to
 *
 */

@Serializable
data class SendMediaGroupRequest(
    @SerialName("business_connection_id") val businessConnectionId: String? = null,
    @SerialName("chat_id")val chatId: String,
    @SerialName("message_thread_id")val messageThreadId: Int? = null,
    @SerialName("media")val media: List<InputMedia>,
    @SerialName("disable_notification")val disableNotification: Boolean? = null,
    @SerialName("protect_content")val protectContent: Boolean? = null,
    @SerialName("message_effect_id")val messageEffectId: String? = null,
    @SerialName("reply_parameters")val replyParameters: ReplyParameters? = null
)  : TelegramRequest{
    override fun endpoint(): String {
        return "sendMediaGroupRequest"
    }
}