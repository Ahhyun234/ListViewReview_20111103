package com.nepplus.listviewreview_20111103

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nepplus.listviewreview_20111103.List.FavoriteAdapter
import com.nepplus.listviewreview_20111103.List.SammiFavoriteData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //여기 사용
    val mSammiFavoriteList = ArrayList<SammiFavoriteData>()
    lateinit var mSammiFavoriteAdapter: FavoriteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//여기 사용
        mSammiFavoriteList.add(SammiFavoriteData(1, "많이", "인형"))
        mSammiFavoriteList.add(SammiFavoriteData(2, "조금", "책"))
        mSammiFavoriteList.add(SammiFavoriteData(3, "최고", "음식"))
        mSammiFavoriteList.add(SammiFavoriteData(4, "싫음", "공부"))
        mSammiFavoriteList.add(SammiFavoriteData(5, "안좋음", "고수"))

        mSammiFavoriteAdapter = FavoriteAdapter(this,R.layout.favorite_item_list,mSammiFavoriteList)
        sammiList.adapter = mSammiFavoriteAdapter

        sammiList.setOnItemClickListener { adapterView, view, position, l ->

            val clickedItem = mSammiFavoriteList[position]
            Toast.makeText(this, "${clickedItem.what} 선택되었습니다.", Toast.LENGTH_SHORT).show()

            val myIntent = Intent(this, ClickedItemDetailActivity::class.java)

            myIntent.putExtra("what",clickedItem.what)
            myIntent.putExtra("howmuch",clickedItem.howMuch)
            myIntent.putExtra("num",clickedItem.num)


            startActivity(myIntent)

        }

      mSammiFavoriteAdapter.notifyDataSetChanged()

    }
}