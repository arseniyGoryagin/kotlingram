package types.payment

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnswerShippingQuery(
    @SerialName("shipping_query_id") val shippingQueryId: String,
    @SerialName("ok") val ok: Boolean,
    @SerialName("shipping_options") val shippingOptions: List<ShippingOption>? = null,
    @SerialName("error_message") val errorMessage: String? = null
)