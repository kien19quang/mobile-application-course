package com.example.ungdungdidong.Tuan2_Kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.ungdungdidong.R

class Tuan2_Kotlin_ListViewMainActivity : AppCompatActivity() {
    var lv: ListView? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan2_kotlin_list_view_main)
        lv = findViewById(R.id.T2KotlinLV);
        val arr = arrayOf("Thu 2", "Thu 3", "Thu 4", "Thu 5", "Thu 6", "Thu 7", "Chu Nhat");
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        lv!!.adapter = adapter;
    }
}