package com.nepplus.pizzaapp_0825_review.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nepplus.pizzaapp_0825_review.R
import com.nepplus.pizzaapp_0825_review.adapters.StoreAdapter
import com.nepplus.pizzaapp_0825_review.datas.StoreData
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*

class PizzaStoreListFragment: Fragment() {

    val mPizzaStores = ArrayList<StoreData>()
    lateinit var mStoreAdapter: StoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mPizzaStores.add(StoreData("피자헛","1588-5588","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"))
        mPizzaStores.add(StoreData("파파존스","1577-8080","http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800"))
        mPizzaStores.add(StoreData("미스터피자","1577-0077","https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200"))
        mPizzaStores.add(StoreData("도미노피자","1577-3082","https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png"))

        mStoreAdapter = StoreAdapter(requireContext(), R.layout.store_list_item , mPizzaStores)
        storeListView.adapter = mStoreAdapter



    }
}