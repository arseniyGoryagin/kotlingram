package types.payment

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StarTransactions(
    @SerialName("transactions") val transactions: List<StarTransaction>
)