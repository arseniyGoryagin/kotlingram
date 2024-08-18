package types.passport
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class PassportElementError {
    @Serializable
    @SerialName("data")
    data class PassportElementErrorDataField(
        @SerialName("source") val source: String,
        @SerialName("type") val type: String,
        @SerialName("field_name") val fieldName: String,
        @SerialName("data_hash") val dataHash: String,
        @SerialName("message") val message: String
    ) : PassportElementError()

    @Serializable
    @SerialName("front_side")
    data class PassportElementErrorFrontSide(
        @SerialName("source") val source: String,
        @SerialName("type") val type: String,
        @SerialName("file_hash") val fileHash: String,
        @SerialName("message") val message: String
    ) : PassportElementError()

    @Serializable
    @SerialName("reverse_side")
    data class PassportElementErrorReverseSide(
        @SerialName("source") val source: String,
        @SerialName("type") val type: String,
        @SerialName("file_hash") val fileHash: String,
        @SerialName("message") val message: String
    ) : PassportElementError()

    @Serializable
    @SerialName("selfie")
    data class PassportElementErrorSelfie(
        @SerialName("source") val source: String,
        @SerialName("type") val type: String,
        @SerialName("file_hash") val fileHash: String,
        @SerialName("message") val message: String
    ) : PassportElementError()

    @Serializable
    @SerialName("file")
    data class PassportElementErrorFile(
        @SerialName("source") val source: String,
        @SerialName("type") val type: String,
        @SerialName("file_hash") val fileHash: String,
        @SerialName("message") val message: String
    ) : PassportElementError()

    @Serializable
    @SerialName("files")
    data class PassportElementErrorFiles(
        @SerialName("source") val source: String,
        @SerialName("type") val type: String,
        @SerialName("file_hashes") val fileHashes: List<String>,
        @SerialName("message") val message: String
    ) : PassportElementError()

    @Serializable
    @SerialName("translation_file")
    data class PassportElementErrorTranslationFile(
        @SerialName("source") val source: String,
        @SerialName("type") val type: String,
        @SerialName("file_hash") val fileHash: String,
        @SerialName("message") val message: String
    ) : PassportElementError()

    @Serializable
    @SerialName("translation_files")
    data class PassportElementErrorTranslationFiles(
        @SerialName("source") val source: String,
        @SerialName("type") val type: String,
        @SerialName("file_hashes") val fileHashes: List<String>,
        @SerialName("message") val message: String
    ) : PassportElementError()

    @Serializable
    @SerialName("unspecified")
    data class PassportElementErrorUnspecified(
        @SerialName("source") val source: String,
        @SerialName("type") val type: String,
        @SerialName("element_hash") val elementHash: String,
        @SerialName("message") val message: String
    ) : PassportElementError()
}