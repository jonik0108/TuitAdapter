package com.abbasov.tuitadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abbasov.tuitadapter.adapters.userAdapters
import com.abbasov.tuitadapter.models.Item
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var userAdapters: userAdapters
    var itemlist=ArrayList<Item>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (i in 0..100){
            itemlist.add(Item(R.drawable.ic_launcher_foreground, "Android"))
            itemlist.add(Item(R.drawable.ic_launcher_foreground, "Java"))
        }


        userAdapters=userAdapters(this,itemlist)
        rv.adapter=userAdapters

    }
}