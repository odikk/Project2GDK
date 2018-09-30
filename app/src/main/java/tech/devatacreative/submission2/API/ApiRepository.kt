package tech.devatacreative.submission2.API

import java.net.URL

class ApiRepository {
    fun doRequest(url: String): String{
        return URL(url).readText()
    }
}