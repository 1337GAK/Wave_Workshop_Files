package com.wave.androidworkshop.sharedprefs;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView showData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showData = (TextView) findViewById(R.id.show);

        //Save prefs button
        Button save = (Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences prefs =  getSharedPreferences("prefs1",MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("key1","value1");
                editor.putInt("key2",2);
                editor.apply();
            }
        });
        Button load = (Button) findViewById(R.id.load);
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences prefs =  getSharedPreferences("prefs1",MODE_PRIVATE);
                String text = prefs.getString("key1",null);
                int number = prefs.getInt("key2",0);
                showData.setText(text+" "+Integer.toString(number));
            }
        });


    }
}
