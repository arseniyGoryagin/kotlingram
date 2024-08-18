package types

import inline.InlineQuery
import kotlinx.serialization.Serializable
import types.payment.PreCheckoutQuery
import types.payment.ShippingQuery

@Serializable
data class Update(
    val update_id : Long,
    val message : Message? = null,
    val edited_message : Message? = null,
    val channel_post : Message?  = null,
    val edited_channel_post : Message? = null,
    val business_connection : Message? = null,
    val business_message : Message?  = null,
    val edited_business_message : Message? = null,
    val deleted_business_messages : BusinessMessagesDeleted? =null,
    val message_reaction : MessageReactionUpdated?  =  null,
    val message_reaction_count : MessageReactionCountUpdated? = null,
    val inline_query : 	InlineQuery?  = null,
    val chosen_inline_result : ChosenInlineResult? = null,
    val callback_query : 	CallbackQuery? = null,
    val shipping_query : ShippingQuery? = null,
    val pre_checkout_query : PreCheckoutQuery? = null,
    val poll : Poll? = null,
    val poll_answer : PollAnswer? = null,
    val my_chat_member : ChatMemberUpdated? = null,
    val chat_member : ChatMemberUpdated? = null,
    val chat_join_request : ChatJoinRequest? = null,
    val chat_boost : 	ChatBoostUpdated? = null,
    val removed_chat_boost  : ChatBoostRemoved? = null
)