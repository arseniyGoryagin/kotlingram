package types

import kotlinx.serialization.Serializable

@Serializable
data class ReactionCount(
    val type: ReactionType,
    val total_count: Long
)