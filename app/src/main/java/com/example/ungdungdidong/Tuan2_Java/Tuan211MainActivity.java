 package com.example.ungdungdidong.Tuan2_Java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.ungdungdidong.R;

public class Tuan211MainActivity extends AppCompatActivity {
    EditText text1, text2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan211_main);
        text1 = findViewById(R.id.Tuan211Text1);
        text2 = findViewById(R.id.Tuan211Text2);
        btn = findViewById(R.id.Tuan211Btn);

        btn.setOnClickListener(v -> {
            Intent i = new Intent(Tuan211MainActivity.this, Tuan211SecondMainActivity.class);
            i.putExtra("so1", text1.getText().toString());
            i.putExtra("so2", text2.getText().toString());
            startActivity(i);
        });
    }
}