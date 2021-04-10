package com.example.medlispharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final ImageButton writeTagButton = findViewById(R.id.tag);

        writeTagButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent q1 = new Intent(Menu.this, Registo1.class);
                startActivity(q1);
            }
        });
        final ImageButton profileButton = findViewById(R.id.profile);

        profileButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent q1 = new Intent(Menu.this, Menu.class);
                startActivity(q1);
            }
        });
    }
}