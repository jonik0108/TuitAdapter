package com.abbasov.tuitadapter.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.abbasov.tuitadapter.R
import com.abbasov.tuitadapter.models.Item
import kotlinx.android.synthetic.main.item_rv.view.*

class userAdapters (val context: Context,val userList: ArrayList<Item>) : RecyclerView.Adapter<userAdapters.Vh>() {
    inner class Vh(var itemRv: View) : RecyclerView.ViewHolder(itemRv) {
        fun onBind(item: Item) {
            itemRv.image1.setImageResource(item.image)
            itemRv.txt1.text=item.name
            itemRv.liner1.animation=AnimationUtils.loadAnimation(context, R.anim.anim1)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(userList[position])
    }

    override fun getItemCount(): Int = userList.size
}