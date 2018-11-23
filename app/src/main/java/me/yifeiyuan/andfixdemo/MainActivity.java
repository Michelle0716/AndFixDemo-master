package me.yifeiyuan.andfixdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, App.TestStr);
        tv.setText(App.TestStr);
        Toast.makeText(MainActivity.this,App.TestStr, Toast.LENGTH_SHORT).show();
    }
}
