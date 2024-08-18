package types

import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable
import types.games.Game
import types.payment.Invoice
import types.stickers.Sticker

@Serializable
data class ExternalReplyInfo(
    val origin: MessageOrigin,
    val chat: Chat? = null,
    val message_id: Int? = null,
    val link_preview_options: LinkPreviewOptions? = null,
    val animation: Animation? = null,
    val audio: Audio? = null,
    val document: Document? = null,
    val paid_media: PaidMediaInfo? = null,
    val photo: List<PhotoSize>? = null,
    val sticker: Sticker? = null,
    val story: Story? = null,
    val video: Video? = null,
    val video_note: VideoNote? = null,
    val voice: Voice? = null,
    val has_media_spoiler: Boolean? = null,
    val contact: Contact? = null,
    val dice: Dice? = null,
    val game: Game? = null,
    val giveaway: Giveaway? = null,
    val giveaway_winners: GiveawayWinners? = null,
    val invoice: Invoice? = null,
    val location: Location? = null,
    val poll: Poll? = null,
    val venue: Venue? = null
)