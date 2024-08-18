package types

import kotlinx.serialization.Serializable


@Serializable
data class ChatLocation(
    val location: Location,
    val address: String
)
