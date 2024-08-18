package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("reply_keyboard_remove")
data class ReplyKeyboardRemove(
    @SerialName("remove_keyboard") val removeKeyboard: Boolean,
    @SerialName("selective") val selective: Boolean? = null
) : ReplyMarkup()