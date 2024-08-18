package types.passport

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PassportData(
    @SerialName("data") val data: List<EncryptedPassportElement>,
    @SerialName("credentials") val credentials: EncryptedCredentials
)