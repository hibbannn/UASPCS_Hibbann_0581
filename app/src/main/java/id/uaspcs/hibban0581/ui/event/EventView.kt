package id.uaspcs.hibban0581.ui.event

import id.uaspcs.hibban0581.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}