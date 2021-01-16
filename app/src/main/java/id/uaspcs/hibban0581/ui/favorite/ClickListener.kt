package id.uaspcs.hibban0581.ui.favorite

import id.uaspcs.hibban0581.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}