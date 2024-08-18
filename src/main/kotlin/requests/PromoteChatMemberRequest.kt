package requests

import TelegramRequest
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PromoteChatMemberRequest(
    @SerialName("chat_id") val chatId: String,
    @SerialName("user_id") val userId: Int,
    @SerialName("is_anonymous") val isAnonymous: Boolean? = null,
    @SerialName("can_manage_chat") val canManageChat: Boolean? = null,
    @SerialName("can_delete_messages") val canDeleteMessages: Boolean? = null,
    @SerialName("can_manage_video_chats") val canManageVideoChats: Boolean? = null,
    @SerialName("can_restrict_members") val canRestrictMembers: Boolean? = null,
    @SerialName("can_promote_members") val canPromoteMembers: Boolean? = null,
    @SerialName("can_change_info") val canChangeInfo: Boolean? = null,
    @SerialName("can_invite_users") val canInviteUsers: Boolean? = null,
    @SerialName("can_post_stories") val canPostStories: Boolean? = null,
    @SerialName("can_edit_stories") val canEditStories: Boolean? = null,
    @SerialName("can_delete_stories") val canDeleteStories: Boolean? = null,
    @SerialName("can_post_messages") val canPostMessages: Boolean? = null,
    @SerialName("can_edit_messages") val canEditMessages: Boolean? = null,
    @SerialName("can_pin_messages") val canPinMessages: Boolean? = null,
    @SerialName("can_manage_topics") val canManageTopics: Boolean? = null
) : TelegramRequest {
    override fun endpoint(): String {
        return "promoteChatMember"
    }
}