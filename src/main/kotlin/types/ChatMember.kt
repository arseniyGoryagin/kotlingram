package types
import User
import kotlinx.serialization.Serializable

@Serializable
sealed class ChatMember {
    @Serializable
    data class ChatMemberOwner(
        val status: String = "creator",
        val user: User,
        val is_anonymous: Boolean,
        val custom_title: String? = null
    ) : ChatMember()

    @Serializable
    data class ChatMemberAdministrator(
        val status: String = "administrator",
        val user: User,
        val can_be_edited: Boolean,
        val is_anonymous: Boolean,
        val can_manage_chat: Boolean,
        val can_delete_messages: Boolean,
        val can_manage_video_chats: Boolean,
        val can_restrict_members: Boolean,
        val can_promote_members: Boolean,
        val can_change_info: Boolean,
        val can_invite_users: Boolean,
        val can_post_stories: Boolean,
        val can_edit_stories: Boolean,
        val can_delete_stories: Boolean,
        val can_post_messages: Boolean? = null,
        val can_edit_messages: Boolean? = null,
        val can_pin_messages: Boolean? = null,
        val can_manage_topics: Boolean? = null,
        val custom_title: String? = null
    ) : ChatMember()

    @Serializable
    data class ChatMemberMember(
        val status: String = "member",
        val user: User
    ) : ChatMember()

    @Serializable
    data class ChatMemberRestricted(
        val status: String = "restricted",
        val user: User,
        val is_member: Boolean,
        val can_send_messages: Boolean,
        val can_send_audios: Boolean,
        val can_send_documents: Boolean,
        val can_send_photos: Boolean,
        val can_send_videos: Boolean,
        val can_send_video_notes: Boolean,
        val can_send_voice_notes: Boolean,
        val can_send_polls: Boolean,
        val can_send_other_messages: Boolean,
        val can_add_web_page_previews: Boolean,
        val can_change_info: Boolean,
        val can_invite_users: Boolean,
        val can_pin_messages: Boolean,
        val can_manage_topics: Boolean,
        val until_date: Int
    ) : ChatMember()

    @Serializable
    data class ChatMemberLeft(
        val status: String = "left",
        val user: User
    ) : ChatMember()

    @Serializable
    data class ChatMemberBanned(
        val status: String = "kicked",
        val user: User,
        val until_date: Int
    ) : ChatMember()
}