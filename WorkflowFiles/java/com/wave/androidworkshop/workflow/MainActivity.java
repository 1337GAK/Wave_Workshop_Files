package com.wave.androidworkshop.workflow;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends Activity {
    String tag = "LifeCycleEvents";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "In the onCreate() event");
        TextView create = (TextView) findViewById(R.id.create);
        create.setText("onCreate called");
    }
    public void onStart()
    {
        super.onStart();
        Log.d(tag, "In the onStart() event");
        TextView start = (TextView) findViewById(R.id.start);
        start.setText("onStart called");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
        TextView create = (TextView) findViewById(R.id.restart);
        create.setText("onRestart called");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "In the onResume() event");
        TextView create = (TextView) findViewById(R.id.resume);
        create.setText("onResume called");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag, "In the onPause() event");
        TextView create = (TextView) findViewById(R.id.pause);
        create.setText("onPause called");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(tag, "In the onStop() event");
        TextView create = (TextView) findViewById(R.id.stop);
        create.setText("onStop called");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
        TextView create = (TextView) findViewById(R.id.destroy);
        create.setText("onDestroy called");
    }
}
