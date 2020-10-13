package com.hemendra.customlisview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        var countrynames_array = arrayOf("India","japan","USA","Russia","Canada")
        var counrtyiages = arrayOf(R.drawable.ind,R.drawable.jap,R.drawable.usa,R.drawable.russia,R.drawable.canada)
        var description_array = arrayOf(R.string.india_desc,R.string.japan_desc,R.string.usa_desc,R.string.russia_desc,R.string.canada_desc )

        var position = intent.getIntExtra("position",0)

        detial_img.setImageResource(counrtyiages[position])
        Countryname_txt.setText(countrynames_array[position])
        detail_txt.setText(description_array[position])
    }
}