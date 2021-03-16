package com.example.kotlin_vk_sdk_template.providers

import android.os.Handler
import com.example.kotlin_vk_sdk_template.models.FriendModel
import com.example.kotlin_vk_sdk_template.presenters.FriendsPresenter


@Suppress("DEPRECATION")
class FriendsProviders(var presenter:FriendsPresenter) {
    fun testLoadFriends(hasFriends:Boolean) {
        Handler().postDelayed({
            val friendsList: ArrayList<FriendModel> = ArrayList()
            if (hasFriends){
                val friend1 = FriendModel(name = "Ivan", surname = "Alekseev",city = null,
                        avatar ="https://www.google.com/search?q=ivan+&tbm=isch&ved=2ahUKEwiQu7S4na3vAhUIiYsKHW1ODJ4Q2-cCegQIABAA&oq=ivan+&gs_lcp=CgNpbWcQAzIECCMQJzICCAAyAggAMgIIADIECAAQQzICCAAyAggAMgIIADICCAAyAggAUJ8KWMARYOEXaABwAHgAgAG1AYgBjwiSAQMwLjaYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=qKpMYJDHLIiSrgTtnLHwCQ&bih=657&biw=791&rlz=1C5CHFA_enKZ933KZ933#imgrc=Um4YwdvaYKHw1M",
                        isOnline = true )

                val friend2 = FriendModel(name = "Dima", surname = "Gagarin",city = "Karaganda",
                        avatar ="https://www.google.com/search?q=ivan+&tbm=isch&ved=2ahUKEwiQu7S4na3vAhUIiYsKHW1ODJ4Q2-cCegQIABAA&oq=ivan+&gs_lcp=CgNpbWcQAzIECCMQJzICCAAyAggAMgIIADIECAAQQzICCAAyAggAMgIIADICCAAyAggAUJ8KWMARYOEXaABwAHgAgAG1AYgBjwiSAQMwLjaYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=qKpMYJDHLIiSrgTtnLHwCQ&bih=657&biw=791&rlz=1C5CHFA_enKZ933KZ933#imgrc=Um4YwdvaYKHw1M",
                        isOnline = true )
                val friend3 = FriendModel(name = "Natali", surname = "Alekseeva",city = "Almaty",
                        avatar ="https://www.google.com/search?q=ivan+&tbm=isch&ved=2ahUKEwiQu7S4na3vAhUIiYsKHW1ODJ4Q2-cCegQIABAA&oq=ivan+&gs_lcp=CgNpbWcQAzIECCMQJzICCAAyAggAMgIIADIECAAQQzICCAAyAggAMgIIADICCAAyAggAUJ8KWMARYOEXaABwAHgAgAG1AYgBjwiSAQMwLjaYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=qKpMYJDHLIiSrgTtnLHwCQ&bih=657&biw=791&rlz=1C5CHFA_enKZ933KZ933#imgrc=Um4YwdvaYKHw1M",
                        isOnline = true )
                val friend4 = FriendModel(name = "Dasha", surname = "Valeeva",city = "Astana"
                    ,
                        avatar ="https://www.google.com/search?q=ivan+&tbm=isch&ved=2ahUKEwiQu7S4na3vAhUIiYsKHW1ODJ4Q2-cCegQIABAA&oq=ivan+&gs_lcp=CgNpbWcQAzIECCMQJzICCAAyAggAMgIIADIECAAQQzICCAAyAggAMgIIADICCAAyAggAUJ8KWMARYOEXaABwAHgAgAG1AYgBjwiSAQMwLjaYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=qKpMYJDHLIiSrgTtnLHwCQ&bih=657&biw=791&rlz=1C5CHFA_enKZ933KZ933#imgrc=Um4YwdvaYKHw1M",
                        isOnline = true )

                friendsList.add(friend1)
                friendsList.add(friend2)
                friendsList.add(friend3)
                friendsList.add(friend4)

            }
            presenter.friendsLoaded(friendsList = friendsList)

        },2000)

    }

}