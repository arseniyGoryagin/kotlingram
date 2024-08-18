package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReplyParameters(
    @SerialName("message_id") val messageId: Long,
    @SerialName("chat_id") val chatId: String? = null,
    @SerialName("allow_sending_without_reply") val allowSendingWithoutReply: Boolean? = null,
    val quote: String? = null,
    @SerialName("quote_parse_mode") val quoteParseMode: String? = null,
    @SerialName("quote_entities") val quoteEntities: List<MessageEntity>? = null,
    @SerialName("quote_position") val quotePosition: Int? = null
) : ReplyMarkup()