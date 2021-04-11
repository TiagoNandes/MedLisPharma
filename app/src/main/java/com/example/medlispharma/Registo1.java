package com.example.medlispharma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Registo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registo1);
        final Button writeTagButton = findViewById(R.id.button);
        EditText nomeMed = (EditText) findViewById(R.id.NomeMedicamento);
        EditText validadeMed = (EditText) findViewById(R.id.DataValidade);
        EditText nDoses = (EditText) findViewById(R.id.NDoses);
        writeTagButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent q1 = new Intent(Registo1.this, Registo2.class);
                q1.putExtra("nomeMed", nomeMed.getText().toString());
                q1.putExtra("validadeMed", validadeMed.getText().toString());
                q1.putExtra("nDoses", nDoses.getText().toString());
                startActivity(q1);
            }
        });

    }
}
