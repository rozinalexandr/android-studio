package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onButtonClick (View v) {
        EditText area_text = (EditText)findViewById(R.id.Area);
        TextView radius_text = (TextView)findViewById(R.id.Result_radius);
        TextView length_text = (TextView)findViewById(R.id.Result_length);

        double area = Double.parseDouble(area_text.getText().toString());
        double radius = Math.sqrt(area / Math.PI);
        double length = radius * 2 * Math.PI;

        radius_text.setText(Double.toString(radius));
        length_text.setText(Double.toString(length));
    }
}