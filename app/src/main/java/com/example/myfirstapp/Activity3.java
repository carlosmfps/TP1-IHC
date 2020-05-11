package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    private Sensor sensor;

    TextView id_sensorX,id_sensorY,id_sensorZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        id_sensorX = (TextView) findViewById(R.id.textView3);
        id_sensorY = (TextView) findViewById(R.id.textView4);
        id_sensorZ = (TextView) findViewById(R.id.textView5);
    }

    @Override
    protected void onResume(){
        super.onResume();
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause(){
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        Sensor sensor = event.sensor;
        if(sensor.getType() == Sensor.TYPE_ACCELEROMETER){
            float sensorX = event.values[0];
            float sensorY = event.values[1];
            float sensorZ = event.values[2];
            id_sensorX.setText(("Accelerometer x: "+ String.valueOf(sensorX)));
            id_sensorY.setText(("Accelerometer y: "+ String.valueOf(sensorY)));
            id_sensorZ.setText(("Accelerometer z: "+ String.valueOf(sensorZ)));

            if(sensorX > 9 && sensorZ > 9 ){
                Intent intent = new Intent(this, ShakeYourPhoneActivity3.class);
                startActivity(intent);
            }

        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
