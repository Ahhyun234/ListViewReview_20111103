package com.nepplus.listviewreview_20111103.List

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nepplus.listviewreview_20111103.R

class FavoriteAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<SammiFavoriteData>
) : ArrayAdapter<SammiFavoriteData>(mContext, resId, mList) {
    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow==null){
            tempRow=mInflater.inflate(R.layout.favorite_item_list,null)
        }

        var row =tempRow!!
//여기서부터 다시 공부***7번

        val data = mList[position]
        val txtNum = row.findViewById<TextView>(R.id.txtNum)
        val txtHowMuch = row.findViewById<TextView>(R.id.txtHowMuch)
        val txtWhat = row.findViewById<TextView>(R.id.txtWhat)

        txtNum.text = data.num.toString()
        txtHowMuch.text = data.howMuch
        txtWhat.text = data.what

        return row
    }

}