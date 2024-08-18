package types.payment

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OrderInfo(
    @SerialName("name") val name: String? = null,
    @SerialName("phone_number") val phoneNumber: String? = null,
    @SerialName("email") val email: String? = null,
    @SerialName("shipping_address") val shippingAddress: ShippingAddress? = null
)