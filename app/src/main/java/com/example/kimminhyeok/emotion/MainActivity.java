package com.example.kimminhyeok.emotion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void happy(View view){
        TextView t = (TextView) findViewById(R.id.text_view);
        t.setText("Happy");
    }
    public void gloomy(View view){
        TextView t = (TextView) findViewById(R.id.text_view);
        t.setText("Gloomy");
    }
}
