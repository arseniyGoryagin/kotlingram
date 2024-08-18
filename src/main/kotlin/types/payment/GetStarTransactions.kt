package types.payment

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetStarTransactions(
    @SerialName("offset") val offset: Int? = null,
    @SerialName("limit") val limit: Int? = null
)