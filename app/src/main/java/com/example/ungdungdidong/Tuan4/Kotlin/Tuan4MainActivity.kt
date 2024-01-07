package com.example.ungdungdidong.Tuan4.Kotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.ungdungdidong.R

class Tuan4MainActivity : AppCompatActivity() {
    var btn: Button? = null;
    var tv: TextView? = null;
    var context: Context = this;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn = findViewById(R.id.btn_t4_java);
        tv = findViewById(R.id.tv_t4_java);
        val fn = VolleyFn();
        btn!!.setOnClickListener({
            fn.getJsonArrayObject(context, tv!!);
        })
    }
}