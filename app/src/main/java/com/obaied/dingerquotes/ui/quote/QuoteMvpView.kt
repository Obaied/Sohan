package com.obaied.dingerquotes.ui.quote

import com.obaied.dingerquotes.data.model.Quote
import com.obaied.dingerquotes.ui.base.MvpView

/**
 * Created by ab on 19/03/2017.
 */

interface QuoteMvpView : MvpView {
    fun onGettingNewQuote(newQuote: Quote)

    fun showError(throwable: Throwable)
}