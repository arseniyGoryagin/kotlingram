package types.games

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.Animation
import types.MessageEntity
import types.PhotoSize

@Serializable
data class Game(
    @SerialName("title") val title: String,
    @SerialName("description") val description: String,
    @SerialName("photo") val photo: List<PhotoSize>,
    @SerialName("text") val text: String? = null,
    @SerialName("text_entities") val textEntities: List<MessageEntity>? = null,
    @SerialName("animation") val animation: Animation? = null
)