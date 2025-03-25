package com.example.slip10q1;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Switch switchBtn = findViewById(R.id.switchBtn);
        ToggleButton toggleBtn = findViewById(R.id.toggleBtn);
        TextView statusText = findViewById(R.id.statusText);
        switchBtn.setOnCheckedChangeListener((btn, isChecked) ->
                statusText.setText("Switch: " + (isChecked ? "ON" : "OFF")));
        toggleBtn.setOnCheckedChangeListener((btn, isChecked) ->
                statusText.setText("Toggle: " + (isChecked ? "ON" : "OFF")));
    }
}
