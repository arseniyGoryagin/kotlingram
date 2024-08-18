package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val latitude: Float,
    val longitude: Float,
    @SerialName("horizontal_accuracy") val horizontalAccuracy: Float? = null,
    @SerialName("live_period") val livePeriod: Int? = null,
    val heading: Int? = null,
    @SerialName("proximity_alert_radius") val proximityAlertRadius: Int? = null
)