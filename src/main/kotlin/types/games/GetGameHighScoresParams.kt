package types.games

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetGameHighScoresParams(
    @SerialName("user_id") val userId: Int,
    @SerialName("chat_id") val chatId: Int? = null,
    @SerialName("message_id") val messageId: Int? = null,
    @SerialName("inline_message_id") val inlineMessageId: String? = null
)