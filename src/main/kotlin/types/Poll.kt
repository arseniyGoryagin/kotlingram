package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Poll(
    val id: String,
    val question: String,
    @SerialName("question_entities") val questionEntities: List<MessageEntity>? = null,
    val options: List<PollOption>,
    @SerialName("total_voter_count") val totalVoterCount: Long,
    @SerialName("is_closed") val isClosed: Boolean,
    @SerialName("is_anonymous") val isAnonymous: Boolean,
    val type: String,
    @SerialName("allows_multiple_answers") val allowsMultipleAnswers: Boolean,
    @SerialName("correct_option_id") val correctOptionId: Long? = null,
    val explanation: String? = null,
    @SerialName("explanation_entities") val explanationEntities: List<MessageEntity>? = null,
    @SerialName("open_period") val openPeriod: Int? = null,
    @SerialName("close_date") val closeDate: Int? = null
)