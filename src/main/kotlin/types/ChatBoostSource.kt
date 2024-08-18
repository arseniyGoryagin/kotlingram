package types

import User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class ChatBoostSource {
    @Serializable
    @SerialName("premium")
    data class ChatBoostSourcePremium(
        val source: String = "premium",
        val user: User
    ) : ChatBoostSource()

    @Serializable
    @SerialName("gift_code")
    data class ChatBoostSourceGiftCode(
        val source: String = "gift_code",
        val user: User
    ) : ChatBoostSource()

    @Serializable
    @SerialName("giveaway")
    data class ChatBoostSourceGiveaway(
        val source: String = "giveaway",
        val giveaway_message_id: Int,
        val user: User? = null,
        val is_unclaimed: Boolean? = null
    ) : ChatBoostSource()
}