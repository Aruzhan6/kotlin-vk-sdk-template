package com.example.kotlin_vk_sdk_template.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.kotlin_vk_sdk_template.R
import com.example.kotlin_vk_sdk_template.presenters.LoginPresenter
import com.example.kotlin_vk_sdk_template.views.LoginView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class LoginActivity :MvpAppCompatActivity(), LoginView{


    @InjectPresenter
    lateinit var loginPresenter:LoginPresenter
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login_enter.setOnClickListener {
            loginPresenter.login(isSuccess = true)
        }


    }

    override fun startLoading() {
      btn_login_enter.visibility = View.GONE
        cpv_login.visibility = View.VISIBLE
    }

    override fun endLoading() {
        btn_login_enter.visibility = View.VISIBLE
        cpv_login.visibility = View.GONE
    }

    override fun showError(textResource: Int) {
        Toast.makeText(applicationContext,getString(textResource),Toast.LENGTH_SHORT).show()

    }

    override fun openFriends() {
        startActivity(Intent(applicationContext,FriendsActivity::class.java))

    }


}