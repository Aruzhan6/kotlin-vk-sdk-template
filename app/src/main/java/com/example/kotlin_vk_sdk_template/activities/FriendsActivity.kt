package com.example.kotlin_vk_sdk_template.activities

import android.annotation.SuppressLint
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.kotlin_vk_sdk_template.R
import com.example.kotlin_vk_sdk_template.adapters.FriendsAdapter
import com.example.kotlin_vk_sdk_template.models.FriendModel
import com.example.kotlin_vk_sdk_template.presenters.FriendsPresenter
import com.example.kotlin_vk_sdk_template.views.FriendsView
import kotlinx.android.synthetic.main.activity_friends.*

class FriendsActivity : MvpAppCompatActivity(), FriendsView {

    @InjectPresenter

    lateinit var friendsPresenter: FriendsPresenter

    private lateinit var mRvFriends: RecyclerView
    private lateinit var mTxtNoItems: TextView
    private lateinit var mCpvWait: ProgressBar
    private lateinit var mAdapter: FriendsAdapter

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        mRvFriends = findViewById(R.id.recycler_friends)
        mTxtNoItems = findViewById(R.id.txt_friends_no_items)
        mCpvWait = findViewById(R.id.cpv_friends)
         friendsPresenter.loadFriends()
         mAdapter = FriendsAdapter()

        friendsPresenter.loadFriends()
        mAdapter = FriendsAdapter()

        mRvFriends.adapter = mAdapter
        mRvFriends.layoutManager = LinearLayoutManager(applicationContext, OrientationHelper.VERTICAL, false)
        mRvFriends.setHasFixedSize(true)



    }

    //Friend View Implementation

    override fun showError(textResource: Int) {
        txt_friends_no_items.text = getString(textResource)

    }

    override fun setupEmptyList(friendsList: ArrayList<FriendModel>) {
        recycler_friends.visibility = View.GONE
        txt_friends_no_items.visibility=View.VISIBLE


    }

    override fun setupFriendsList(friendsList: ArrayList<FriendModel>) {
        recycler_friends.visibility = View.VISIBLE
        txt_friends_no_items.visibility=View.GONE

        mAdapter.setupFriends(friendList = friendsList)
    }

    override fun startLoading() {
        recycler_friends.visibility = View.GONE
        txt_friends_no_items.visibility=View.GONE
        cpv_friends.visibility=View.VISIBLE
    }

    override fun endLoading() {
        cpv_friends.visibility=View.GONE

    }
}