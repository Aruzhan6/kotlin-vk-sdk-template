package com.example.kotlin_vk_sdk_template.adapters

import android.annotation.SuppressLint
import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_vk_sdk_template.R
import com.example.kotlin_vk_sdk_template.models.FriendModel
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView

@Suppress("UNREACHABLE_CODE")
class FriendsAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
 private var mFriensdList:ArrayList<FriendModel> = ArrayList()

    fun setupFriends(friendList: ArrayList<FriendModel>){
        mFriensdList.clear()
        mFriensdList.addAll(friendList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")

        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.cell_friend, parent, false)
        return FriendsViewHolder(itemView = itemView)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is FriendsViewHolder){
            holder.bind(friendModel= mFriensdList[position])
        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
       return mFriensdList.count()
    }
    class FriendsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){



            private var mCivAvatar: CircleImageView = itemView.findViewById(R.id.friend_civ_avatar)
            private var mTxtUsername: TextView = itemView.findViewById(R.id.friend_txt_username)
            private var mTxtCity: TextView = itemView.findViewById(R.id.friend_txt_city)
            private var mImgOnline: View = itemView.findViewById(R.id.friend_img_online)



        @SuppressLint("SetTextI18n")
        fun bind(friendModel: FriendModel){
            friendModel.avatar?.let { url->

                Picasso.get().load(friendModel.avatar).into(mCivAvatar)
            }




            mTxtUsername.text = "${friendModel.name} ${friendModel.surname}"
            mTxtCity.text = itemView.context.getString(R.string.friend_no_city)
            friendModel.city.let { city-> mTxtCity.text = city }

            if (friendModel.isOnline){
                mImgOnline.visibility = View.VISIBLE
            }else{
                mImgOnline.visibility =View.GONE
            }

        }
    }
}