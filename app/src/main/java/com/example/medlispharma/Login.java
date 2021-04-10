package com.example.medlispharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final Button loginButton = findViewById(R.id.button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent q1 = new Intent(Login.this, Menu.class);
                startActivity(q1);
            }
        });
    }
}