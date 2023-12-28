package com.example.ungdungdidong.Tuan2_Kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.ungdungdidong.R

class Tuan2_Kotlin_SecondMainActivity : AppCompatActivity() {
    var tv: TextView? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan2_kotlin_second_main)

        tv = findViewById(R.id.T2KotlinTV);
        var i1 = intent;
        val chuoi1 = i1.extras!!.getString("so1");
        val chuoi2 = i1.extras!!.getString("so2");
        val so1 = chuoi1!!.toFloat();
        val so2 = chuoi2!!.toFloat();
        val tong = so1 + so2;
        tv!!.text = tong.toString();
    }
}