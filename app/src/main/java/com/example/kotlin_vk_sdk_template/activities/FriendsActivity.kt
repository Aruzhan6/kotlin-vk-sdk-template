package com.example.kotlin_vk_sdk_template.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.kotlin_vk_sdk_template.R
import com.example.kotlin_vk_sdk_template.models.FriendModel
import com.example.kotlin_vk_sdk_template.presenters.FriendsPresenter
import com.example.kotlin_vk_sdk_template.views.FriendsView

class FriendsActivity : MvpAppCompatActivity(), FriendsView {

    @InjectPresenter
    lateinit var  friendsPresenter: FriendsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)



    }

    //Friend View Implementation

    override fun showError(text: String) {

    }

    override fun setupEmptyList() {

    }

    override fun setupFriendsList(friendsList: ArrayList<FriendModel>) {

    }
}