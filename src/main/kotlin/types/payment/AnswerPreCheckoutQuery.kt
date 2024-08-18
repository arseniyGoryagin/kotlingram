package types.payment

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnswerPreCheckoutQuery(
    @SerialName("pre_checkout_query_id") val preCheckoutQueryId: String,
    @SerialName("ok") val ok: Boolean,
    @SerialName("error_message") val errorMessage: String? = null
)