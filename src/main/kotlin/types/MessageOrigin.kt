package types
import User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
sealed class MessageOrigin {

    @Serializable
    @SerialName("user")
    data class MessageOriginUser(
        @SerialName("type") val type: String = "user",
        @SerialName("date") val date: Int,
        @SerialName("sender_user") val senderUser: User
    ) : MessageOrigin()

    @Serializable
    @SerialName("hidden_user")
    data class MessageOriginHiddenUser(
        @SerialName("type") val type: String = "hidden_user",
        @SerialName("date") val date: Int,
        @SerialName("sender_user_name") val senderUserName: String
    ) : MessageOrigin()

    @Serializable
    @SerialName("chat")
    data class MessageOriginChat(
        @SerialName("type") val type: String = "chat",
        @SerialName("date") val date: Int,
        @SerialName("sender_chat") val senderChat: Chat,
        @SerialName("author_signature") val authorSignature: String? = null
    ) : MessageOrigin()

    @Serializable
    @SerialName("channel")
    data class MessageOriginChannel(
        @SerialName("type") val type: String = "channel",
        @SerialName("date") val date: Int,
        @SerialName("chat") val chat: Chat,
        @SerialName("message_id") val messageId: Int,
        @SerialName("author_signature") val authorSignature: String? = null
    ) : MessageOrigin()
}