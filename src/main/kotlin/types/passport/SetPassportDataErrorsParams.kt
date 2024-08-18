package types.passport

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class SetPassportDataErrorsParams(
    @SerialName("user_id") val userId: Int,
    @SerialName("errors") val errors: List<PassportElementError>
)