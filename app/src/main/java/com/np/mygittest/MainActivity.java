package com.np.mygittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TAG", "First update.");
        Log.i("TAG", "I'm origin/master update.");
        Log.i("TAG", "I'm origin/master update2.You should execute git pull origin master to update.");
    }
}
