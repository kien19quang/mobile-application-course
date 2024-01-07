package com.example.ungdungdidong.Tuan4.Java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ungdungdidong.R;

public class MainActivity extends AppCompatActivity {
    Button btnGetData;
    TextView tvRes;

    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        VolleyFn volleyFn = new VolleyFn();
        tvRes = findViewById(R.id.tv_t4_java);
        btnGetData = findViewById(R.id.btn_t4_java);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.getJSONArrayOfObject(context, tvRes);

            }
        });
    }
}