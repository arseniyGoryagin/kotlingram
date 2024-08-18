package types.payment
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class RevenueWithdrawalState {
    @Serializable
    @SerialName("pending")
    data class Pending(
        @SerialName("type") val type: String = "pending"
    ) : RevenueWithdrawalState()

    @Serializable
    @SerialName("succeeded")
    data class Succeeded(
        @SerialName("type") val type: String = "succeeded",
        @SerialName("date") val date: Int,
        @SerialName("url") val url: String
    ) : RevenueWithdrawalState()

    @Serializable
    @SerialName("failed")
    data class Failed(
        @SerialName("type") val type: String = "failed"
    ) : RevenueWithdrawalState()
}