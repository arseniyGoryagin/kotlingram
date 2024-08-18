package types.payment
import User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.PaidMedia

@Serializable
sealed class TransactionPartner {

    @Serializable
    @SerialName("user")
    data class TransactionPartnerUser(
        @SerialName("type") val type: String = "user",
        @SerialName("user") val user: User,
        @SerialName("invoice_payload") val invoicePayload: String? = null,
        @SerialName("paid_media") val paidMedia: List<PaidMedia>? = null
    ) : TransactionPartner()

    @Serializable
    @SerialName("fragment")
    data class TransactionPartnerFragment(
        @SerialName("type") val type: String = "fragment",
        @SerialName("withdrawal_state") val withdrawalState: RevenueWithdrawalState? = null
    ) : TransactionPartner()

    @Serializable
    @SerialName("telegram_ads")
    data class TransactionPartnerTelegramAds(
        @SerialName("type") val type: String = "telegram_ads"
    ) : TransactionPartner()

    @Serializable
    @SerialName("other")
    data class TransactionPartnerOther(
        @SerialName("type") val type: String = "other"
    ) : TransactionPartner()
}