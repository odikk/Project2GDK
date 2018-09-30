package tech.devatacreative.submission2.Match.LastMatch

import tech.devatacreative.submission2.Model.EventsItem

interface MatchInterface{
    fun showLoading()
    fun hideLoading()
    fun showMatchList(data: List<EventsItem?>)
    fun showNextMatchList(data: List<EventsItem?>)
}