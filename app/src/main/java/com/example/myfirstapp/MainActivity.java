package com.example.myfirstapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void gotoAct1(View view){
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);

    }

    public void gotoAct2(View view){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void gotoAct3(View view){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

}