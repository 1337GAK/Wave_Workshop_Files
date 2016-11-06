package com.wave.androidworkshop.xmldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ProgressBar bar1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = (Button) findViewById(R.id.button2);

        ToggleButton toggleBar = (ToggleButton) findViewById(R.id.toggleButton);

        bar1 = (ProgressBar) findViewById(R.id.progressBar);
        toggleBar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bar1.setVisibility(View.VISIBLE);
                } else {
                    bar1.setVisibility(View.INVISIBLE);
                }
            }
            });
        }
    }
