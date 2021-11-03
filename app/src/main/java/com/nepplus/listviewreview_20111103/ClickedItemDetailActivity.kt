package com.nepplus.listviewreview_20111103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.favorite_item_list.*

class ClickedItemDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clicked_item_detail)


        val what = intent.getStringExtra("what")
        txtWhat.text = what

        val howMuch = intent.getStringExtra("howMuch")
        txtHowMuch.text = howMuch
    }
}