package com.example.kotlin_vk_sdk_template.views

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.kotlin_vk_sdk_template.models.FriendModel

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface FriendsView:MvpView {
    fun showError(text:String)
    fun setupEmptyList()
    fun setupFriendsList(friendsList: ArrayList<FriendModel>)

}