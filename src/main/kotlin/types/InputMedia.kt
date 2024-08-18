package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class InputMedia {

    @Serializable
    @SerialName("photo")
    data class InputMediaPhoto(
        val type: String = "photo",
        val media: String,
        val caption: String? = null,
        val parse_mode: String? = null,
        val caption_entities: List<MessageEntity>? = null,
        val show_caption_above_media: Boolean? = null,
        val has_spoiler: Boolean? = null
    ) : InputMedia()

    @Serializable
    @SerialName("video")
    data class InputMediaVideo(
        val type: String = "video",
        val media: String,
        val thumbnail: String? = null,
        val caption: String? = null,
        val parse_mode: String? = null,
        val caption_entities: List<MessageEntity>? = null,
        val show_caption_above_media: Boolean? = null,
        val width: Int? = null,
        val height: Int? = null,
        val duration: Int? = null,
        val supports_streaming: Boolean? = null,
        val has_spoiler: Boolean? = null
    ) : InputMedia()

    @Serializable
    @SerialName("animation")
    data class InputMediaAnimation(
        val type: String = "animation",
        val media: String,
        val thumbnail: String? = null,
        val caption: String? = null,
        val parse_mode: String? = null,
        val caption_entities: List<MessageEntity>? = null,
        val show_caption_above_media: Boolean? = null,
        val width: Int? = null,
        val height: Int? = null,
        val duration: Int? = null,
        val has_spoiler: Boolean? = null
    ) : InputMedia()

    @Serializable
    @SerialName("audio")
    data class InputMediaAudio(
        val type: String = "audio",
        val media: String,
        val thumbnail: String? = null,
        val caption: String? = null,
        val parse_mode: String? = null,
        val caption_entities: List<MessageEntity>? = null,
        val duration: Int? = null,
        val performer: String? = null,
        val title: String? = null
    ) : InputMedia()

    @kotlinx.serialization.Serializable
    @SerialName("document")
    data class InputMediaDocument(
        val type: String = "document",
        val media: String,
        val thumbnail: String? = null,
        val caption: String? = null,
        val parse_mode: String? = null,
        val caption_entities: List<MessageEntity>? = null,
        val disable_content_type_detection: Boolean? = null
    ) : InputMedia()
}