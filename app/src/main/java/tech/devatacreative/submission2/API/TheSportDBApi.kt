package tech.devatacreative.submission2.API

import android.net.Uri
import tech.devatacreative.submission2.BuildConfig

object TheSportDBApi {
    fun GetLastMatch(match: String?): String{
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
                .appendPath("api")
                .appendPath("v1")
                .appendPath("json")
                .appendPath(BuildConfig.TSDB_API_KEY)
                .appendPath("eventspastleague.php?")
                .appendQueryParameter("m", match)
                .build()
                .toString()
    }

    fun getNextMatch(nextMatch: String?): String {
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
                .appendPath("api")
                .appendPath("v1")
                .appendPath("json")
                .appendPath(BuildConfig.TSDB_API_KEY)
                .appendPath("eventsnextleague.php")
                .appendQueryParameter("id", "4328")
                .build()
                .toString()
    }
}