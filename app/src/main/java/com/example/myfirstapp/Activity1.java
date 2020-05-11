package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {
    private EditText et1,et2;
    private Button bt;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        et1 = (EditText) findViewById(R.id.txt_number1); // ID from component
        et2 = (EditText) findViewById(R.id.txt_number2); // ID from component
        tv = (TextView) findViewById(R.id.textView);
        bt = (Button) findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                double num1 = Double.parseDouble(et1.getText().toString());
                double num2 = Double.parseDouble(et2.getText().toString());
                double sum = num1 + num2;
                tv.setText("Result: " + Double.toString(sum));
            }

        });
    }
}
