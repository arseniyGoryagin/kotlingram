package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Use this method to set a new group sticker set for a supergroup.
 * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
 * Returns True on success.
 *
 * @property chatId Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername).
 * @property stickerSetName Name of the sticker set to be set as the group sticker set.
 */
@Serializable
data class SetChatStickerSetRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("sticker_set_name") val stickerSetName: String
) : TelegramRequest {
    override fun endpoint(): String {
        return "setChatStickerSet"
    }
}