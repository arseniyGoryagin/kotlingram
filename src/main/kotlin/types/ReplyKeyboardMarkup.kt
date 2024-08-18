package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("reply_keyboard_markup")
data class ReplyKeyboardMarkup(
    @SerialName("keyboard") val keyboard: List<List<KeyboardButton>>,
    @SerialName("is_persistent") val isPersistent: Boolean? = null,
    @SerialName("resize_keyboard") val resizeKeyboard: Boolean? = null,
    @SerialName("one_time_keyboard") val oneTimeKeyboard: Boolean? = null,
    @SerialName("input_field_placeholder") val inputFieldPlaceholder: String? = null,
    @SerialName("selective") val selective: Boolean? = null
) : ReplyMarkup()