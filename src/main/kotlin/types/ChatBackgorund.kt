package types

import kotlinx.serialization.Serializable

@Serializable
data class ChatBackground(
    val type: BackgroundType
)