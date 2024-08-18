package types.games

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SetGameScoreParams(
    @SerialName("user_id") val userId: Int,
    @SerialName("score") val score: Int,
    @SerialName("force") val force: Boolean? = null,
    @SerialName("disable_edit_message") val disableEditMessage: Boolean? = null,
    @SerialName("chat_id") val chatId: Int? = null,
    @SerialName("message_id") val messageId: Int? = null,
    @SerialName("inline_message_id") val inlineMessageId: String? = null
)