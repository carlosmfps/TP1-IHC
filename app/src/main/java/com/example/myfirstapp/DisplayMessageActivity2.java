package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity2 extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_display_message);

        String message = getIntent().getStringExtra("data");

        textView = (TextView) findViewById(R.id.textView2);
        textView.setText(message);
    }
}
