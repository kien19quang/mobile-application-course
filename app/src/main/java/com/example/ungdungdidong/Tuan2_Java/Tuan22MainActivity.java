package com.example.ungdungdidong.Tuan2_Java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ungdungdidong.R;

public class Tuan22MainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);

        lv = findViewById(R.id.Tuan22ListView);
        String[] arr = new String[]{"Thu 2", "Thu 3", "Thu 4", "Thu 5", "Thu 6", "Thu 7", "Chu Nhat"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);

        lv.setAdapter(adapter);
    }
}