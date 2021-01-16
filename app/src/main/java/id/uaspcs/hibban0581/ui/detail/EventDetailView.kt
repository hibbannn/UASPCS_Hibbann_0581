package id.uaspcs.hibban0581.ui.detail


import id.uaspcs.hibban0581.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}