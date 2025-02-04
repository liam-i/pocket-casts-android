package au.com.shiftyjelly.pocketcasts.servers.sync.login

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LoginPocketCastsRequest(
    @field:Json(name = "email") val email: String,
    @field:Json(name = "password") val password: String,
)
