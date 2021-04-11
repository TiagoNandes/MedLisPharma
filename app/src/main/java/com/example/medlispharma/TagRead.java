package com.example.medlispharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class TagRead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_read);

        int timeout = 2000; // make the activity visible for 4 seconds

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                finish();
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    //The key argument here must match that used in the other activity
                    Intent medication = new Intent(TagRead.this, Menu.class);
                    startActivity(medication);
                }
            }
        }, timeout);
    }
}