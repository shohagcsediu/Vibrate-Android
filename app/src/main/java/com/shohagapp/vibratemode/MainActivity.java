package com.shohagapp.vibratemode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button vibrateET;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vibrateET = findViewById(R.id.vibrateme);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        vibrateET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(1000);
            }
        });
    }
}
