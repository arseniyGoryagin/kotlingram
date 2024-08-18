package types

import kotlinx.serialization.Serializable

@Serializable
data class BusinessOpeningHoursInterval(
    val opening_minute: Int,
    val closing_minute: Int
)