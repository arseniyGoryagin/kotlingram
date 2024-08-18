package types.payment

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ShippingOption(
    @SerialName("id") val id: String,
    @SerialName("title") val title: String,
    @SerialName("prices") val prices: List<LabeledPrice>
)