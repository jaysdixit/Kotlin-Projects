package com.example.age_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show.setOnClickListener {
            var ag:Int = edit.text.toString().toInt()
            var curYear = Calendar.getInstance().get(Calendar.YEAR)
            var myage:Int = curYear - ag
            show.text = "Your age is $myage years"

        }
    }
}
