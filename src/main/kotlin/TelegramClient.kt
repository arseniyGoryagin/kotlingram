import okhttp3.*
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.File






class TelegramClient(private val token : String) {




    private val client = OkHttpClient()

    private val BASE_URL = "https://api.telegram.org/bot$token/"


    fun getReq(endpoint : String, params: Map<String, Any>? = null) : String?{


        var paramsString = ""

        params?.forEach{ paramName, value ->
            paramsString += "${paramName}=${value}"
        }

        val url = "${BASE_URL}${endpoint}${if(!params.isNullOrEmpty()){"?"}else{""}}${paramsString}"

        val request = Request.Builder()
            .get()
            .url(url)
            .build()

        client.newCall(request).execute().use { response ->
            return response.body?.string()
        }
    }

    fun postReq(endpoint : String, json : String) : String?{


        val body :RequestBody = json.toRequestBody()

        val request = Request.Builder()
            .post(body)
            .url(BASE_URL + endpoint)
            .addHeader("Content-Type", "application/json")
            .build()

        client.newCall(request).execute().use{ response ->
            return response.body?.string()
        }

    }



    fun postFile(endpoint : String,
                 file : File,
                 fileType : String,
                 params : Map<String, Any> = emptyMap()
    ) : String?{

        val builder = MultipartBody.Builder()
            .setType(MultipartBody.FORM)

        params.forEach { (key, value) ->
            builder.addFormDataPart(key, value.toString())
        }

        val body = builder.addFormDataPart(fileType, file.name, file.asRequestBody()).build()

        val request = Request.Builder()
            .post(body)
            .url(BASE_URL + endpoint)
            .addHeader("Content-Type", "application/json")
            .build()

        client.newCall(request).execute().use{ response ->
            return response.body?.string()
        }

    }


}