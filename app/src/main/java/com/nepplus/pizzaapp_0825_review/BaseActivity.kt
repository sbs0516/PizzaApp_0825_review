package com.nepplus.pizzaapp_0825_review

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    val mContext = this

    abstract fun setValues()

    abstract fun setupEvents()

}