package types

import User
import kotlinx.serialization.Serializable

@Serializable
data class ProximityAlertTriggered(
    val traveler: User,
    val watcher: User,
    val distance: Int
)