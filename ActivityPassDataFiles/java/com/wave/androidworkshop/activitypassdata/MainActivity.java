package com.wave.androidworkshop.activitypassdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) findViewById(R.id.buttonGo);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeActivityIntent = new Intent(MainActivity.this , MainActivity2.class);
                startActivity(changeActivityIntent);
            }
        });


        Button button2 = (Button) findViewById(R.id.buttonChangeText);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeActIntent = new Intent(v.getContext(), MainActivity2.class);
                changeActIntent.putExtra("TextData" , "The text has changed");
                startActivity(changeActIntent);
            }
        });

    }
}
