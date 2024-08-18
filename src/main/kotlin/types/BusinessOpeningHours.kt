package types

import kotlinx.serialization.Serializable

@Serializable
data class BusinessOpeningHours(
    val time_zone_name: String,
    val opening_hours: List<BusinessOpeningHoursInterval>
)