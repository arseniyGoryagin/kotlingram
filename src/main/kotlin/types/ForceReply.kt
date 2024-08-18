package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("force_reply")
data class ForceReply(
    val force_reply: Boolean,
    val input_field_placeholder: String? = null,
    val selective: Boolean? = null
) : ReplyMarkup()