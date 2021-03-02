package com.example.kotlin_vk_sdk_template.adapters

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_vk_sdk_template.R
import com.example.kotlin_vk_sdk_template.models.FriendModel

@Suppress("UNREACHABLE_CODE")
class FriendsAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
 var mFriensdList:ArrayList<FriendModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")

        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.cell_friend,parent,false)
        return FriendsViewHolder(itemView = itemView)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
       return mFriensdList.count()
    }
    class FriendsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }
}