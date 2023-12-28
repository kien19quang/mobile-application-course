package com.example.ungdungdidong.Tuan2_Kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.ungdungdidong.R

class Tuan2_KotlinMainActivity : AppCompatActivity() {
    var text1: EditText? = null;
    var text2: EditText? = null;
    var btn: Button? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan2_kotlin_main)
        text1 = findViewById(R.id.T2KotlinText1);
        text2 = findViewById(R.id.T2KotlinText2);
        btn = findViewById(R.id.T2KotlinBtn);

        btn!!.setOnClickListener({
            var i = Intent(this@Tuan2_KotlinMainActivity, Tuan2_Kotlin_SecondMainActivity::class.java);
            i.putExtra("so1", text1!!.text.toString());
            i.putExtra("so2", text2!!.text.toString());
            startActivity(i);
        })
    }
}