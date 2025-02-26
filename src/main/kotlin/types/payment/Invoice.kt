package types.payment

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Invoice(
    @SerialName("title") val title: String,
    @SerialName("description") val description: String,
    @SerialName("start_parameter") val startParameter: String,
    @SerialName("currency") val currency: String,
    @SerialName("total_amount") val totalAmount: Int
)