package types

import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable

@Serializable
data class PaidMediaInfo(
    val star_count: Int,
    val paid_media: List<PaidMedia>
)

/*



val serializersModule = SerializersModule {
    polymorphic(PaidMedia::class) {
        subclass(PaidMediaPreview::class)
        subclass(PaidMediaPhoto::class)
        subclass(PaidMediaVideo::class)
    }
}


 */