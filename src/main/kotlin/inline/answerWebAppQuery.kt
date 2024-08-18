package inline

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnswerWebAppQuery (

    @SerialName("web_app_query_id") val  webAppQueryId : String,
    val result : InlineQueryResult

) : TelegramRequest{
    override fun endpoint(): String {
        return "answerWebAppQuery"
    }

}