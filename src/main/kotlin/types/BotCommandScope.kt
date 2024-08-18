package types
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
sealed class BotCommandScope {
    @Serializable
    @SerialName("default")
    data class BotCommandScopeDefault(
        val type: String = "default"
    ) : BotCommandScope()

    @Serializable
    @SerialName("all_private_chats")
    data class BotCommandScopeAllPrivateChats(
        val type: String = "all_private_chats"
    ) : BotCommandScope()

    @Serializable
    @SerialName("all_group_chats")
    data class BotCommandScopeAllGroupChats(
        val type: String = "all_group_chats"
    ) : BotCommandScope()

    @Serializable
    @SerialName("all_chat_administrators")
    data class BotCommandScopeAllChatAdministrators(
        val type: String = "all_chat_administrators"
    ) : BotCommandScope()

    @Serializable
    @SerialName("chat")
    data class BotCommandScopeChat(
        val type: String = "chat",
        val chat_id: String
    ) : BotCommandScope()

    @Serializable
    @SerialName("chat_administrators")
    data class BotCommandScopeChatAdministrators(
        val type: String = "chat_administrators",
        val chat_id: String
    ) : BotCommandScope()

    @Serializable
    @SerialName("chat_member")
    data class BotCommandScopeChatMember(
        val type: String = "chat_member",
        val chat_id: String,
        val user_id: Int
    ) : BotCommandScope()
}