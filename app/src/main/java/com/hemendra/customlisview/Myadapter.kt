package com.hemendra.customlisview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.list_item.view.*

class Myadapter(var ctx:Context) :BaseAdapter()
{

    var countrynames_array = arrayOf("India","japan","USA","Russia","Canada")
    var counrtyiages = arrayOf(R.drawable.ind,R.drawable.jap,R.drawable.usa,R.drawable.russia,R.drawable.canada)

    //how each item look like
    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {

        var layoutInflater = LayoutInflater.from(ctx)
        var view = layoutInflater.inflate(R.layout.list_item,p2,false)

        view.tv.setText(countrynames_array[position])
        view.iv.setImageResource(counrtyiages[position])
        return view
    }

   //Total item count
    override fun getCount(): Int {
      return countrynames_array.size
    }

    override fun getItem(p0: Int): Any {
        return 0
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

}