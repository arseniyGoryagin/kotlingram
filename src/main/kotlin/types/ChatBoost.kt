package types

import kotlinx.serialization.Serializable

@Serializable
data class ChatBoost(
    val boost_id: String,
    val add_date: Int,
    val expiration_date: Int,
    val source: ChatBoostSource
)
