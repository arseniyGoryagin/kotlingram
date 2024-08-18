package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class ReplyMarkup{


    @Serializable
    @SerialName("inline_keyboard_markup")
    data class InlineKeyboardMarkup(
        @SerialName("inline_keyboard") val inlineKeyboard: List<List<InlineKeyboardButton>>
    )

}