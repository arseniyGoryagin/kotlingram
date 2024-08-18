package types.payment

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RefundStarPayment(
    @SerialName("user_id") val userId: Int,
    @SerialName("telegram_payment_charge_id") val telegramPaymentChargeId: String
)