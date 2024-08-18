package types

import kotlinx.serialization.Serializable

@Serializable
data class InputFile(
    val file: String
)