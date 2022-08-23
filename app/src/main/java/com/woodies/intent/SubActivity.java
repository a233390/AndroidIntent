package com.woodies.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    private TextView tv_id;
    private TextView tv_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_id = findViewById(R.id.tv_id);
        tv_pw = findViewById(R.id.tv_pw);

        Intent intent = getIntent();
        String getId = intent.getStringExtra("id");
        String getPw = intent.getStringExtra("pw");

        tv_id.setText(getId);
        tv_pw.setText(getPw);
    }
}