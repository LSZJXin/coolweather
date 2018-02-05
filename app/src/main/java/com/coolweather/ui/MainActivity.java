package com.coolweather.ui;

import android.os.Bundle;
import android.util.Log;

import com.coolweather.R;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
