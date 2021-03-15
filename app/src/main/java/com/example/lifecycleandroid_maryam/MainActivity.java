package com.example.lifecycleandroid_maryam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");
    }
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle","onCreate invoked");
    }
    protected void onResume() {
        super.onResume();
        super.onStart();
        Log.d("lifecycle", "onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        super.onStart();
        Log.d("lifecycle", "onPause invoked");
    }
    protected void onStop() {
        super.onStop();
        super.onPause();
        super.onStart();
        Log.d("lifecycle", "onStop invoked");
    }
    protected void onRestart() {
        super.onRestart();
        super.onPause();
        super.onStart();
        Log.d("lifecycle", "onRestart invoked");
    }
    protected void onDestroy() {
        super.onDestroy();
        super.onStart();
        Log.d("lifecycle", "onDestroy invoked");
    }
}