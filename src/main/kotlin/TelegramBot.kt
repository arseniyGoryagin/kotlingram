import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.json.JSONObject
import types.Update





@Target(AnnotationTarget.FUNCTION)
annotation class OnMessage(val messages : Array<String>)

@Target(AnnotationTarget.FUNCTION)
annotation class OnUpdate()


class TelegramBot(token : String){

    //Update on set
    private var onUpdate : (Update) -> Unit = {}
    fun setOnUpdate(onUpdateCb : (Update) -> Unit) {onUpdate = onUpdateCb}
    private val UPDATES_ENDPOINT = "getUpdates"


    val tgClient = TelegramClient(token);
    private var offset = 0


    private lateinit var onMessagesCb : MutableList< Pair< Array<String> ,Any> >


    fun start(){
        while (true){
            val response = fetchUpdates(offset)
            if(response != null){
                offset = fetchNewOffset(response)
                handleUpdate(response)
            }
        }
    }

    private fun handleUpdate(update : JSONObject){

        val result = update.getJSONArray("result")

        for(i in 0 until result.length())
        {
            val updateJSON = result.getJSONObject(i)
            println(updateJSON)
            val update  : Update = Json.decodeFromString<Update>(updateJSON.toString())
            onUpdate(update)
            println(update)
        }


    }


    private fun fetchUpdates(offset : Int) : JSONObject?{
        val params = mutableMapOf(
            "offset" to  offset
        )
        return tgClient.getReq(UPDATES_ENDPOINT, params = params).let {
            JSONObject(it)
        }
    }

    private fun fetchNewOffset(resp: JSONObject) : Int{
        val result = resp.getJSONArray("result")
        return if(result.length() >  0){
                val index = result.length() - 1
                result.getJSONObject(index).getInt("update_id") + 1
        }else{0}
    }


    // Requests
    inline fun <reified T : TelegramRequest> sendRequest(req : T) : String?{
        val json = Json.encodeToString(req)
        return tgClient.postReq(endpoint = req.endpoint(), json)
    }





    fun sendMessage(){

    }


}