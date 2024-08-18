package inline

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import types.LinkPreviewOptions
import types.MessageEntity
import types.payment.LabeledPrice

/**
 * Represents the content of a message to be sent as a result of an inline query.
 */
@Serializable
sealed class InputMessageContent {

    /**
     * Represents the content of a text message to be sent as the result of an inline query.
     *
     * @property messageText Text of the message to be sent, 1-4096 characters
     * @property parseMode Optional. Mode for parsing entities in the message text
     * @property entities Optional. List of special entities that appear in message text
     * @property linkPreviewOptions Optional. Link preview generation options for the message
     */
    @Serializable
    data class InputTextMessageContent(
        @SerialName("message_text") val messageText: String,
        @SerialName("parse_mode") val parseMode: String? = null,
        @SerialName("entities") val entities: List<MessageEntity>? = null,
        @SerialName("link_preview_options") val linkPreviewOptions: LinkPreviewOptions? = null
    )

    /**
     * Represents the content of a location message to be sent as the result of an inline query.
     *
     * @property latitude Latitude of the location in degrees
     * @property longitude Longitude of the location in degrees
     * @property horizontalAccuracy Optional. The radius of uncertainty for the location
     * @property livePeriod Optional. Period in seconds during which the location can be updated
     * @property heading Optional. Direction in which the user is moving, in degrees
     * @property proximityAlertRadius Optional. Maximum distance for proximity alerts
     */
    @Serializable
    data class InputLocationMessageContent(
        @SerialName("latitude") val latitude: Float,
        @SerialName("longitude") val longitude: Float,
        @SerialName("horizontal_accuracy") val horizontalAccuracy: Float? = null,
        @SerialName("live_period") val livePeriod: Int? = null,
        @SerialName("heading") val heading: Int? = null,
        @SerialName("proximity_alert_radius") val proximityAlertRadius: Int? = null
    )

    /**
     * Represents the content of a venue message to be sent as the result of an inline query.
     *
     * @property latitude Latitude of the venue in degrees
     * @property longitude Longitude of the venue in degrees
     * @property title Name of the venue
     * @property address Address of the venue
     * @property foursquareId Optional. Foursquare identifier of the venue
     * @property foursquareType Optional. Foursquare type of the venue
     * @property googlePlaceId Optional. Google Places identifier of the venue
     * @property googlePlaceType Optional. Google Places type of the venue
     */
    @Serializable
    data class InputVenueMessageContent(
        @SerialName("latitude") val latitude: Float,
        @SerialName("longitude") val longitude: Float,
        @SerialName("title") val title: String,
        @SerialName("address") val address: String,
        @SerialName("foursquare_id") val foursquareId: String? = null,
        @SerialName("foursquare_type") val foursquareType: String? = null,
        @SerialName("google_place_id") val googlePlaceId: String? = null,
        @SerialName("google_place_type") val googlePlaceType: String? = null
    )

    /**
     * Represents the content of a contact message to be sent as the result of an inline query.
     *
     * @property phoneNumber Contact's phone number
     * @property firstName Contact's first name
     * @property lastName Optional. Contact's last name
     * @property vcard Optional. Additional data about the contact in the form of a vCard
     */
    @Serializable
    data class InputContactMessageContent(
        @SerialName("phone_number") val phoneNumber: String,
        @SerialName("first_name") val firstName: String,
        @SerialName("last_name") val lastName: String? = null,
        @SerialName("vcard") val vcard: String? = null
    )

    /**
     * Represents the content of an invoice message to be sent as the result of an inline query.
     *
     * @property title Product name, 1-32 characters
     * @property description Product description, 1-255 characters
     * @property payload Bot-defined invoice payload, 1-128 bytes
     * @property providerToken Optional. Payment provider token
     * @property currency Three-letter ISO 4217 currency code
     * @property prices Price breakdown, a JSON-serialized list of components
     * @property maxTipAmount Optional. The maximum accepted amount for tips
     * @property suggestedTipAmounts Optional. Suggested amounts of tip
     * @property providerData Optional. Data about the invoice for the payment provider
     * @property photoUrl Optional. URL of the product photo for the invoice
     * @property photoSize Optional. Photo size in bytes
     * @property photoWidth Optional. Photo width
     * @property photoHeight Optional. Photo height
     * @property needName Optional. Pass True if you require the user's full name
     * @property needPhoneNumber Optional. Pass True if you require the user's phone number
     * @property needEmail Optional. Pass True if you require the user's email address
     * @property needShippingAddress Optional. Pass True if you require the user's shipping address
     * @property sendPhoneNumberToProvider Optional. Pass True if the user's phone number should be sent to the provider
     * @property sendEmailToProvider Optional. Pass True if the user's email address should be sent to the provider
     * @property isFlexible Optional. Pass True if the final price depends on the shipping method
     */
    @Serializable
    data class InputInvoiceMessageContent(
        @SerialName("title") val title: String,
        @SerialName("description") val description: String,
        @SerialName("payload") val payload: String,
        @SerialName("provider_token") val providerToken: String? = null,
        @SerialName("currency") val currency: String,
        @SerialName("prices") val prices: List<LabeledPrice>,
        @SerialName("max_tip_amount") val maxTipAmount: Int? = null,
        @SerialName("suggested_tip_amounts") val suggestedTipAmounts: List<Int>? = null,
        @SerialName("provider_data") val providerData: String? = null,
        @SerialName("photo_url") val photoUrl: String? = null,
        @SerialName("photo_size") val photoSize: Int? = null,
        @SerialName("photo_width") val photoWidth: Int? = null,
        @SerialName("photo_height") val photoHeight: Int? = null,
        @SerialName("need_name") val needName: Boolean? = null,
        @SerialName("need_phone_number") val needPhoneNumber: Boolean? = null,
        @SerialName("need_email") val needEmail: Boolean? = null,
        @SerialName("need_shipping_address") val needShippingAddress: Boolean? = null,
        @SerialName("send_phone_number_to_provider") val sendPhoneNumberToProvider: Boolean? = null,
        @SerialName("send_email_to_provider") val sendEmailToProvider: Boolean? = null,
        @SerialName("is_flexible") val isFlexible: Boolean? = null
    )
}

