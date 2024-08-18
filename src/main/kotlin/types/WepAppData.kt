package types

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class WebAppData(
    @SerialName("data")
    val data: String,
    @SerialName("button_text")
    val buttonText: String
)