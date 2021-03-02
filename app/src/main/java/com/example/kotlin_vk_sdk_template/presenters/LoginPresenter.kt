package com.example.kotlin_vk_sdk_template.presenters

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.kotlin_vk_sdk_template.views.LoginView
import java.util.logging.Handler

@Suppress("DEPRECATION")
@InjectViewState
class LoginPresenter:MvpPresenter<LoginView>() {
    fun login(isSuccess:Boolean) {

        viewState.startLoading()
        viewState.endLoading()
       android.os.Handler().postDelayed({
          if (isSuccess){
              viewState.openFriends()
          } else{
              viewState.showError(text = "Login data is incorrect")
          }

       },500)

    }
}