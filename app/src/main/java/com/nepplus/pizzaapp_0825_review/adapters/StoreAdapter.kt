package com.nepplus.pizzaapp_0825_review.adapters

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.nepplus.pizzaapp_0825_review.R
import com.nepplus.pizzaapp_0825_review.datas.StoreData

class StoreAdapter(
    val mContext: Context,
    resId: Int,
    val mList: List<StoreData>): ArrayAdapter<StoreData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null) {
            tempRow = mInflater.inflate(R.layout.store_list_item,null)
        }
        val row = tempRow!!

        val data = mList[position]
        val logoImg = row.findViewById<ImageView>(R.id.logoImg)
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)

        nameTxt.text = data.name
        Glide.with(mContext).load(data.logoURL).into(logoImg)

        return row
    }
}