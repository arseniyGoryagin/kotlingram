package inline

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.WebAppInfo

/**
 * This object represents a button to be shown above inline query results.
 * You must use exactly one of the optional fields.
 *
 * @property text Label text on the button.
 * @property webApp Optional. Description of the Web App that will be launched when the user presses the button.
 * @property startParameter Optional. Deep-linking parameter for the /start message sent to the bot when a user presses the button.
 */
@Serializable
data class InlineQueryResultsButton(
    @SerialName("text") val text: String,
    @SerialName("web_app") val webApp: WebAppInfo? = null,
    @SerialName("start_parameter") val startParameter: String? = null
){
    init {
        validateInput()
    }

    private fun validateInput(){
        if(webApp != null && startParameter != null){
            throw Exception("Two optional fields specofied where one should!!")
        }
    }
}