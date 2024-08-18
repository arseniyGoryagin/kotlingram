package inline

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineKeyboardMarkup
import types.InputMessageContent
import types.MessageEntity

@Serializable
sealed class InlineQueryResult{


    /**
     * Represents a link to an article or web page.
     *
     * @property id Unique identifier for this result, 1-64 Bytes
     * @property title Title of the result
     * @property inputMessageContent Content of the message to be sent
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property url Optional. URL of the result
     * @property hideUrl Optional. Pass True if you don't want the URL to be shown in the message
     * @property description Optional. Short description of the result
     * @property thumbnailUrl Optional. Url of the thumbnail for the result
     * @property thumbnailWidth Optional. Thumbnail width
     * @property thumbnailHeight Optional. Thumbnail height
     */
    @Serializable
    @SerialName("article")
    data class InlineQueryResultArticle(
        @SerialName("id") val id: String,
        @SerialName("title") val title: String,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("url") val url: String? = null,
        @SerialName("hide_url") val hideUrl: Boolean? = null,
        @SerialName("description") val description: String? = null,
        @SerialName("thumbnail_url") val thumbnailUrl: String? = null,
        @SerialName("thumbnail_width") val thumbnailWidth: Int? = null,
        @SerialName("thumbnail_height") val thumbnailHeight: Int? = null
    ) : InlineQueryResult()



    /**
     * Represents a link to a photo.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property photoUrl A valid URL of the photo
     * @property thumbnailUrl URL of the thumbnail for the photo
     * @property photoWidth Optional. Width of the photo
     * @property photoHeight Optional. Height of the photo
     * @property title Optional. Title for the result
     * @property description Optional. Short description of the result
     * @property caption Optional. Caption of the photo to be sent
     * @property parseMode Optional. Mode for parsing entities in the photo caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property showCaptionAboveMedia Optional. Pass True, if the caption must be shown above the message media
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the photo
     */
    @Serializable
    @SerialName("photo")
    data class InlineQueryResultPhoto(
        @SerialName("id") val id: String,
        @SerialName("photo_url") val photoUrl: String,
        @SerialName("thumbnail_url") val thumbnailUrl: String? = null,
        @SerialName("photo_width") val photoWidth: Int? = null,
        @SerialName("photo_height") val photoHeight: Int? = null,
        @SerialName("title") val title: String? = null,
        @SerialName("description") val description: String? = null,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("show_caption_above_media") val showCaptionAboveMedia: Boolean? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to an animated GIF file.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property gifUrl A valid URL for the GIF file
     * @property gifWidth Optional. Width of the GIF
     * @property gifHeight Optional. Height of the GIF
     * @property gifDuration Optional. Duration of the GIF in seconds
     * @property thumbnailUrl URL of the static or animated thumbnail for the result
     * @property thumbnailMimeType Optional. MIME type of the thumbnail
     * @property title Optional. Title for the result
     * @property caption Optional. Caption of the GIF file to be sent
     * @property parseMode Optional. Mode for parsing entities in the caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property showCaptionAboveMedia Optional. Pass True, if the caption must be shown above the message media
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the GIF animation
     */
    @Serializable
    @SerialName("gif")
    data class InlineQueryResultGif(
        @SerialName("id") val id: String,
        @SerialName("gif_url") val gifUrl: String,
        @SerialName("gif_width") val gifWidth: Int? = null,
        @SerialName("gif_height") val gifHeight: Int? = null,
        @SerialName("gif_duration") val gifDuration: Int? = null,
        @SerialName("thumbnail_url") val thumbnailUrl: String? = null,
        @SerialName("thumbnail_mime_type") val thumbnailMimeType: String? = null,
        @SerialName("title") val title: String? = null,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("show_caption_above_media") val showCaptionAboveMedia: Boolean? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound).
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property mpeg4Url A valid URL for the MPEG4 file
     * @property mpeg4Width Optional. Video width
     * @property mpeg4Height Optional. Video height
     * @property mpeg4Duration Optional. Video duration in seconds
     * @property thumbnailUrl URL of the static or animated thumbnail for the result
     * @property thumbnailMimeType Optional. MIME type of the thumbnail
     * @property title Optional. Title for the result
     * @property caption Optional. Caption of the MPEG-4 file to be sent
     * @property parseMode Optional. Mode for parsing entities in the caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property showCaptionAboveMedia Optional. Pass True, if the caption must be shown above the message media
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the video animation
     */
    @Serializable
    @SerialName("mpeg4_gif")
    data class InlineQueryResultMpeg4Gif(
        @SerialName("id") val id: String,
        @SerialName("mpeg4_url") val mpeg4Url: String,
        @SerialName("mpeg4_width") val mpeg4Width: Int? = null,
        @SerialName("mpeg4_height") val mpeg4Height: Int? = null,
        @SerialName("mpeg4_duration") val mpeg4Duration: Int? = null,
        @SerialName("thumbnail_url") val thumbnailUrl: String? = null,
        @SerialName("thumbnail_mime_type") val thumbnailMimeType: String? = null,
        @SerialName("title") val title: String? = null,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("show_caption_above_media") val showCaptionAboveMedia: Boolean? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to a page containing an embedded video player or a video file.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property videoUrl A valid URL for the embedded video player or video file
     * @property mimeType MIME type of the content of the video URL
     * @property thumbnailUrl URL of the thumbnail for the video
     * @property title Title for the result
     * @property caption Optional. Caption of the video to be sent
     * @property parseMode Optional. Mode for parsing entities in the video caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property showCaptionAboveMedia Optional. Pass True, if the caption must be shown above the message media
     * @property videoWidth Optional. Video width
     * @property videoHeight Optional. Video height
     * @property videoDuration Optional. Video duration in seconds
     * @property description Optional. Short description of the result
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the video
     */
    @Serializable
    @SerialName("video")
    data class InlineQueryResultVideo(
        @SerialName("id") val id: String,
        @SerialName("video_url") val videoUrl: String,
        @SerialName("mime_type") val mimeType: String,
        @SerialName("thumbnail_url") val thumbnailUrl: String? = null,
        @SerialName("title") val title: String,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("show_caption_above_media") val showCaptionAboveMedia: Boolean? = null,
        @SerialName("video_width") val videoWidth: Int? = null,
        @SerialName("video_height") val videoHeight: Int? = null,
        @SerialName("video_duration") val videoDuration: Int? = null,
        @SerialName("description") val description: String? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to an MP3 audio file.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property audioUrl A valid URL for the audio file
     * @property title Title
     * @property caption Optional. Caption, 0-1024 characters after entities parsing
     * @property parseMode Optional. Mode for parsing entities in the audio caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property performer Optional. Performer
     * @property audioDuration Optional. Audio duration in seconds
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the audio
     */
    @Serializable
    @SerialName("audio")
    data class InlineQueryResultAudio(
        @SerialName("id") val id: String,
        @SerialName("audio_url") val audioUrl: String,
        @SerialName("title") val title: String,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("performer") val performer: String? = null,
        @SerialName("audio_duration") val audioDuration: Int? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to a voice recording in an .OGG container encoded with OPUS.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property voiceUrl A valid URL for the voice recording
     * @property title Recording title
     * @property caption Optional. Caption, 0-1024 characters after entities parsing
     * @property parseMode Optional. Mode for parsing entities in the voice message caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property voiceDuration Optional. Recording duration in seconds
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the voice recording
     */
    @Serializable
    @SerialName("voice")
    data class InlineQueryResultVoice(
        @SerialName("id") val id: String,
        @SerialName("voice_url") val voiceUrl: String,
        @SerialName("title") val title: String,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("voice_duration") val voiceDuration: Int? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to a file.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property title Title for the result
     * @property caption Optional. Caption of the document to be sent
     * @property parseMode Optional. Mode for parsing entities in the document caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property documentUrl A valid URL for the file
     * @property mimeType MIME type of the content of the file
     * @property description Optional. Short description of the result
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the file
     * @property thumbnailUrl Optional. URL of the thumbnail for the file
     * @property thumbnailWidth Optional. Thumbnail width
     * @property thumbnailHeight Optional. Thumbnail height
     */
    @Serializable
    @SerialName("document")
    data class InlineQueryResultDocument(
        @SerialName("id") val id: String,
        @SerialName("title") val title: String,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("document_url") val documentUrl: String,
        @SerialName("mime_type") val mimeType: String,
        @SerialName("description") val description: String? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null,
        @SerialName("thumbnail_url") val thumbnailUrl: String? = null,
        @SerialName("thumbnail_width") val thumbnailWidth: Int? = null,
        @SerialName("thumbnail_height") val thumbnailHeight: Int? = null
    ) : InlineQueryResult()

    /**
     * Represents a location on a map.
     *
     * @property id Unique identifier for this result, 1-64 Bytes
     * @property latitude Location latitude in degrees
     * @property longitude Location longitude in degrees
     * @property title Location title
     * @property horizontalAccuracy Optional. The radius of uncertainty for the location
     * @property livePeriod Optional. Period in seconds during which the location can be updated
     * @property heading Optional. For live locations, a direction in which the user is moving
     * @property proximityAlertRadius Optional. For live locations, a maximum distance for proximity alerts
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the location
     * @property thumbnailUrl Optional. Url of the thumbnail for the result
     * @property thumbnailWidth Optional. Thumbnail width
     * @property thumbnailHeight Optional. Thumbnail height
     */
    @Serializable
    @SerialName("location")
    data class InlineQueryResultLocation(
        @SerialName("id") val id: String,
        @SerialName("latitude") val latitude: Float,
        @SerialName("longitude") val longitude: Float,
        @SerialName("title") val title: String,
        @SerialName("horizontal_accuracy") val horizontalAccuracy: Float? = null,
        @SerialName("live_period") val livePeriod: Int? = null,
        @SerialName("heading") val heading: Int? = null,
        @SerialName("proximity_alert_radius") val proximityAlertRadius: Int? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null,
        @SerialName("thumbnail_url") val thumbnailUrl: String? = null,
        @SerialName("thumbnail_width") val thumbnailWidth: Int? = null,
        @SerialName("thumbnail_height") val thumbnailHeight: Int? = null
    ) : InlineQueryResult()

    /**
     * Represents a venue.
     *
     * @property id Unique identifier for this result, 1-64 Bytes
     * @property latitude Latitude of the venue location in degrees
     * @property longitude Longitude of the venue location in degrees
     * @property title Title of the venue
     * @property address Address of the venue
     * @property foursquareId Optional. Foursquare identifier of the venue if known
     * @property foursquareType Optional. Foursquare type of the venue, if known
     * @property googlePlaceId Optional. Google Places identifier of the venue
     * @property googlePlaceType Optional. Google Places type of the venue
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the venue
     * @property thumbnailUrl Optional. Url of the thumbnail for the result
     * @property thumbnailWidth Optional. Thumbnail width
     * @property thumbnailHeight Optional. Thumbnail height
     */
    @Serializable
    @SerialName("venue")
    data class InlineQueryResultVenue(
        @SerialName("id") val id: String,
        @SerialName("latitude") val latitude: Float,
        @SerialName("longitude") val longitude: Float,
        @SerialName("title") val title: String,
        @SerialName("address") val address: String,
        @SerialName("foursquare_id") val foursquareId: String? = null,
        @SerialName("foursquare_type") val foursquareType: String? = null,
        @SerialName("google_place_id") val googlePlaceId: String? = null,
        @SerialName("google_place_type") val googlePlaceType: String? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null,
        @SerialName("thumbnail_url") val thumbnailUrl: String? = null,
        @SerialName("thumbnail_width") val thumbnailWidth: Int? = null,
        @SerialName("thumbnail_height") val thumbnailHeight: Int? = null
    ) : InlineQueryResult()

    /**
     * Represents a contact with a phone number.
     *
     * @property id Unique identifier for this result, 1-64 Bytes
     * @property phoneNumber Contact's phone number
     * @property firstName Contact's first name
     * @property lastName Optional. Contact's last name
     * @property vcard Optional. Additional data about the contact in the form of a vCard
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the contact
     * @property thumbnailUrl Optional. Url of the thumbnail for the result
     * @property thumbnailWidth Optional. Thumbnail width
     * @property thumbnailHeight Optional. Thumbnail height
     */
    @Serializable
    @SerialName("contact")
    data class InlineQueryResultContact(
        @SerialName("id") val id: String,
        @SerialName("phone_number") val phoneNumber: String,
        @SerialName("first_name") val firstName: String,
        @SerialName("last_name") val lastName: String? = null,
        @SerialName("vcard") val vcard: String? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null,
        @SerialName("thumbnail_url") val thumbnailUrl: String? = null,
        @SerialName("thumbnail_width") val thumbnailWidth: Int? = null,
        @SerialName("thumbnail_height") val thumbnailHeight: Int? = null
    ) : InlineQueryResult()

    /**
     * Represents a Game.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property gameShortName Short name of the game
     * @property replyMarkup Optional. Inline keyboard attached to the message
     */
    @Serializable
    @SerialName("game")
    data class InlineQueryResultGame(
        @SerialName("id") val id: String,
        @SerialName("game_short_name") val gameShortName: String,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to a photo stored on the Telegram servers.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property photoFileId A valid file identifier of the photo
     * @property title Optional. Title for the result
     * @property description Optional. Short description of the result
     * @property caption Optional. Caption of the photo to be sent
     * @property parseMode Optional. Mode for parsing entities in the photo caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property showCaptionAboveMedia Optional. Pass True, if the caption must be shown above the message media
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the photo
     */
    @Serializable
    @SerialName("photo")
    data class InlineQueryResultCachedPhoto(
        @SerialName("id") val id: String,
        @SerialName("photo_file_id") val photoFileId: String,
        @SerialName("title") val title: String? = null,
        @SerialName("description") val description: String? = null,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("show_caption_above_media") val showCaptionAboveMedia: Boolean? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to an animated GIF file stored on the Telegram servers.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property gifFileId A valid file identifier for the GIF file
     * @property title Optional. Title for the result
     * @property caption Optional. Caption of the GIF file to be sent
     * @property parseMode Optional. Mode for parsing entities in the caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property showCaptionAboveMedia Optional. Pass True, if the caption must be shown above the message media
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the GIF animation
     */
    @Serializable
    @SerialName("gif")
    data class InlineQueryResultCachedGif(
        @SerialName("id") val id: String,
        @SerialName("gif_file_id") val gifFileId: String,
        @SerialName("title") val title: String? = null,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("show_caption_above_media") val showCaptionAboveMedia: Boolean? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound) stored on the Telegram servers.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property mpeg4FileId A valid file identifier for the MPEG4 file
     * @property title Optional. Title for the result
     * @property caption Optional. Caption of the MPEG-4 file to be sent
     * @property parseMode Optional. Mode for parsing entities in the caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property showCaptionAboveMedia Optional. Pass True, if the caption must be shown above the message media
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the video animation
     */
    @Serializable
    @SerialName("mpeg4_gif")
    data class InlineQueryResultCachedMpeg4Gif(
        @SerialName("id") val id: String,
        @SerialName("mpeg4_file_id") val mpeg4FileId: String,
        @SerialName("title") val title: String? = null,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("show_caption_above_media") val showCaptionAboveMedia: Boolean? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()



    /**
     * Represents a link to a sticker stored on the Telegram servers.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property stickerFileId A valid file identifier of the sticker
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the sticker
     */
    @Serializable
    @SerialName("sticker")
    data class InlineQueryResultCachedSticker(
        @SerialName("id") val id: String,
        @SerialName("sticker_file_id") val stickerFileId: String,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to a file stored on the Telegram servers.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property title Title for the result
     * @property documentFileId A valid file identifier for the file
     * @property description Optional. Short description of the result
     * @property caption Optional. Caption of the document to be sent
     * @property parseMode Optional. Mode for parsing entities in the document caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the file
     */
    @Serializable
    @SerialName("document")
    data class InlineQueryResultCachedDocument(
        @SerialName("id") val id: String,
        @SerialName("title") val title: String,
        @SerialName("document_file_id") val documentFileId: String,
        @SerialName("description") val description: String? = null,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to a video file stored on the Telegram servers.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property videoFileId A valid file identifier for the video file
     * @property title Title for the result
     * @property description Optional. Short description of the result
     * @property caption Optional. Caption of the video to be sent
     * @property parseMode Optional. Mode for parsing entities in the video caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property showCaptionAboveMedia Optional. Pass True, if the caption must be shown above the message media
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the video
     */
    @Serializable
    @SerialName("video")
    data class InlineQueryResultCachedVideo(
        @SerialName("id") val id: String,
        @SerialName("video_file_id") val videoFileId: String,
        @SerialName("title") val title: String,
        @SerialName("description") val description: String? = null,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("show_caption_above_media") val showCaptionAboveMedia: Boolean? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to a voice message stored on the Telegram servers.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property voiceFileId A valid file identifier for the voice message
     * @property title Voice message title
     * @property caption Optional. Caption of the voice message to be sent
     * @property parseMode Optional. Mode for parsing entities in the voice message caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the voice message
     */
    @Serializable
    @SerialName("voice")
    data class InlineQueryResultCachedVoice(
        @SerialName("id") val id: String,
        @SerialName("voice_file_id") val voiceFileId: String,
        @SerialName("title") val title: String,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()

    /**
     * Represents a link to an MP3 audio file stored on the Telegram servers.
     *
     * @property id Unique identifier for this result, 1-64 bytes
     * @property audioFileId A valid file identifier for the audio file
     * @property caption Optional. Caption of the audio to be sent
     * @property parseMode Optional. Mode for parsing entities in the audio caption
     * @property captionEntities Optional. List of special entities that appear in the caption
     * @property replyMarkup Optional. Inline keyboard attached to the message
     * @property inputMessageContent Optional. Content of the message to be sent instead of the audio
     */
    @Serializable
    @SerialName("audio")
    data class InlineQueryResultCachedAudio(
        @SerialName("id") val id: String,
        @SerialName("audio_file_id") val audioFileId: String,
        @SerialName("caption") val caption: String? = null,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("caption_entities") val captionEntities: List<MessageEntity>? = null,
        @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
        @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
    ) : InlineQueryResult()


}