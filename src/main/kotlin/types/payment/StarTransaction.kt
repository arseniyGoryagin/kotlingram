package types.payment

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StarTransaction(
    @SerialName("id") val id: String,
    @SerialName("amount") val amount: Int,
    @SerialName("date") val date: Int,
    @SerialName("source") val source: TransactionPartner? = null,
    @SerialName("receiver") val receiver: TransactionPartner? = null
)