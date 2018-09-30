package tech.devatacreative.submission2.Match.LastMatch

import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import tech.devatacreative.submission2.API.ApiRepository
import tech.devatacreative.submission2.API.TheSportDBApi
import tech.devatacreative.submission2.Model.Response

class MatchPresenter(private val view: MatchInterface,
                     private val apiRepository: ApiRepository,
                     private val gson: Gson){
    fun getMatchList(match: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDBApi.GetLastMatch(match)),
                    Response::class.java)
            uiThread {
                view.hideLoading()
                view.showMatchList(data.match)
            }
        }
    }

    fun getNextMatchList(match: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDBApi.getNextMatch(match)),
                    Response::class.java)
        uiThread {
            view.hideLoading()
            view.showNextMatchList(data.match)
        }
        }
    }
}