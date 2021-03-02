package com.example.kotlin_vk_sdk_template.views

import android.widget.TextView
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType


@StateStrategyType(value =AddToEndSingleStrategy::class)
interface LoginView: MvpView{

    fun startLoading()
    fun endLoading()
    fun showError(text: String)
    fun openFriends()
}