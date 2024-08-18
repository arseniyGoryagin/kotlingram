package types

import kotlinx.serialization.Serializable

@Serializable
data class UserChatBoosts(
    val boosts: List<ChatBoost>
)