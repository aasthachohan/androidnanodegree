package com.example.android.musicpicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView menu = (ImageView) findViewById(R.id.background);
        menu.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View v){
             Intent page1 = new Intent(MainActivity.this, MenuActivity.class);
             startActivity(page1);
         }

        });
    }
}
