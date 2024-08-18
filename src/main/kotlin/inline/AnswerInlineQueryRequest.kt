package inline

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to send answers to an inline query.
 * On success, True is returned. No more than 50 results per query are allowed.
 *
 * @property inlineQueryId Unique identifier for the answered query.
 * @property results A JSON-serialized array of results for the inline query.
 * @property cacheTime The maximum amount of time in seconds that the result of the inline query may be cached on the server.
 * @property isPersonal Pass True if results may be cached on the server side only for the user that sent the query.
 * @property nextOffset Pass the offset that a client should send in the next query with the same text to receive more results.
 * @property button A JSON-serialized object describing a button to be shown above inline query results.
 */
@Serializable
data class AnswerInlineQueryRequest(
    @SerialName("inline_query_id") val inlineQueryId: String,
    @SerialName("results") val results: List<InlineQueryResult>,
    @SerialName("cache_time") val cacheTime: Int? = null,
    @SerialName("is_personal") val isPersonal: Boolean? = null,
    @SerialName("next_offset") val nextOffset: String? = null,
    @SerialName("button") val button: InlineQueryResultsButton? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "answerInlineQuery"
    }
}