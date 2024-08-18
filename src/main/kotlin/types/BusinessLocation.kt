package types

import kotlinx.serialization.Serializable

@Serializable
data class BusinessLocation(
    val address: String,
    val location: Location? = null
)