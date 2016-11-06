package com.wave.androidworkshop.buttontextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = (TextView) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView testView = (TextView) v;
                testView.append("I AM v");
                //test.append("Clicked through listener");
                Log.i("error",v.findViewById(R.id.test).toString());
            }


        });
    }
//    void myFunc(View v){
//        test = (TextView) findViewById(R.id.test);
//        test.setText("Clicked through onClick XMl");
//    }

}
