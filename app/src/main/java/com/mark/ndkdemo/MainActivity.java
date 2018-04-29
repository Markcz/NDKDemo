package com.mark.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.txt);
        String ttt= new JNI().sayHello();
        String ttt1 = new JNI().hello();
        Log.i("test","jni----"+ttt);
        t.setText(ttt+ttt1);
    }
}
