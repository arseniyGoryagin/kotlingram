package types.games

import User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GameHighScore(
    @SerialName("position") val position: Int,
    @SerialName("user") val user: User,
    @SerialName("score") val score: Int
)