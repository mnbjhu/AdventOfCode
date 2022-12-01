import com.natpryce.konfig.*
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.cookies.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

val sessionKey = Key("session", stringType)

val config = ConfigurationProperties.fromResource("local.properties")

val client = HttpClient(CIO) {
    install(ContentNegotiation){
        json()
    }
    install(HttpCookies) {
        storage = ConstantCookiesStorage(
            Cookie(
                name = "session",
                value = config[sessionKey],
                domain = "adventofcode.com"
            )
        )
    }
}

suspend fun main() {
    coroutineScope {
        launch {
            Day1.getAnswerPartTwo()
        }
    }
}