package types
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class InputPaidMedia {
    @Serializable
    @SerialName("photo")
    data class InputPaidMediaPhoto(
        val type: String = "photo",
        val media: String
    ) : InputPaidMedia()

    @Serializable
    @SerialName("video")
    data class InputPaidMediaVideo(
        val type: String = "video",
        val media: String,
        val thumbnail: String? = null,
        val width: Int? = null,
        val height: Int? = null,
        val duration: Int? = null,
        val supports_streaming: Boolean? = null
    ) : InputPaidMedia()
}