package types

import kotlinx.serialization.Serializable

@Serializable
data class PaidMediaVideo(
    override val type: String = "video",
    val video: Video
) : PaidMedia()
