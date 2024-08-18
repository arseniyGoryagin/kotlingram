package types.payment

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ShippingAddress(
    @SerialName("country_code") val countryCode: String,
    @SerialName("state") val state: String? = null,
    @SerialName("city") val city: String,
    @SerialName("street_line1") val streetLine1: String,
    @SerialName("street_line2") val streetLine2: String? = null,
    @SerialName("post_code") val postCode: String
)