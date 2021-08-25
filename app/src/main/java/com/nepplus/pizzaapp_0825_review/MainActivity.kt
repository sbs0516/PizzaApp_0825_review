package com.nepplus.pizzaapp_0825_review

import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.pizzaapp_0825_review.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mainViewPagerAdapter: FragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setValues() {

        mainViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mainViewPagerAdapter
        mainTabLayout.setupWithViewPager(mainViewPager)

    }
    override fun setupEvents() {

    }

}