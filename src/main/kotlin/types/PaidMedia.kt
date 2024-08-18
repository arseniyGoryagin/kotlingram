package types

import kotlinx.serialization.Serializable


@Serializable
sealed class PaidMedia {
    abstract val type : String
}