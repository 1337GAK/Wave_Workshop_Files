package com.wave.androidworkshop.activitypassdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView text = (TextView) findViewById(R.id.textViewAct2);

        Bundle passedData = getIntent().getExtras();
        if (passedData != null) {
            String importedText = passedData.getString("TextData");
            text.setText(importedText);
        }

    }
}
