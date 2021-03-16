package com.example.kotlin_vk_sdk_template.presenters

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.kotlin_vk_sdk_template.R
import com.example.kotlin_vk_sdk_template.models.FriendModel
import com.example.kotlin_vk_sdk_template.providers.FriendsProviders
import com.example.kotlin_vk_sdk_template.views.FriendsView


@InjectViewState
class FriendsPresenter:MvpPresenter<FriendsView>() {

    fun loadFriends() {
        viewState.startLoading()
        FriendsProviders(presenter = this).testLoadFriends(hasFriends = true)

    }

    fun friendsLoaded(friendsList:ArrayList<FriendModel>){
     viewState.endLoading()
        if (friendsList.size == 0){
            viewState.setupEmptyList(friendsList)
            viewState.showError(textResource = R.string.friends_no_items)
        } else{
            viewState.setupEmptyList(friendsList = friendsList)
        }

    }

}