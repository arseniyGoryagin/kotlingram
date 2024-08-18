package types

import kotlinx.serialization.Serializable

@Serializable
data class ChatPermissions(
    val can_send_messages: Boolean? = null,
    val can_send_audios: Boolean? = null,
    val can_send_documents: Boolean? = null,
    val can_send_photos: Boolean? = null,
    val can_send_videos: Boolean? = null,
    val can_send_video_notes: Boolean? = null,
    val can_send_voice_notes: Boolean? = null,
    val can_send_polls: Boolean? = null,
    val can_send_other_messages: Boolean? = null,
    val can_add_web_page_previews: Boolean? = null,
    val can_change_info: Boolean? = null,
    val can_invite_users: Boolean? = null,
    val can_pin_messages: Boolean? = null,
    val can_manage_topics: Boolean? = null
)