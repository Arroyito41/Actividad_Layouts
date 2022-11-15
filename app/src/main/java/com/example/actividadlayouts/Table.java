package com.example.actividadlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Table extends AppCompatActivity {

    EditText resultado;
    Button uno;
    Button dos;
    Button tres;
    Button cuatro;
    Button cinco;
    Button seis;
    Button siete;
    Button ocho;
    Button nueve;
    Button cero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        resultado = findViewById(R.id.editTextTextPRes);
        uno = findViewById(R.id.buttonT1);
        dos = findViewById(R.id.buttonT2);
        tres = findViewById(R.id.buttonT3);
        cuatro = findViewById(R.id.buttonT4);
        cinco = findViewById(R.id.buttonT5);
        seis = findViewById(R.id.buttonT6);
        siete = findViewById(R.id.buttonT7);
        ocho = findViewById(R.id.buttonT8);
        nueve = findViewById(R.id.buttonT9);
        cero = findViewById(R.id.buttonT0);
    }

    public void uno(View view) {

        resultado.setText(resultado.getText().toString() + uno.getText().toString());
    }

    public void dos(View view) {

        resultado.setText(resultado.getText().toString() + dos.getText().toString());
    }

    public void tres(View view) {

        resultado.setText(resultado.getText().toString() + tres.getText().toString());
    }

    public void cuatro(View view) {

        resultado.setText(resultado.getText().toString() + cuatro.getText().toString());
    }

    public void cinco(View view) {

        resultado.setText(resultado.getText().toString() + cinco.getText().toString());
    }

    public void seis(View view) {

        resultado.setText(resultado.getText().toString() + seis.getText().toString());
    }

    public void siete(View view) {

        resultado.setText(resultado.getText().toString() + siete.getText().toString());
    }

    public void ocho(View view) {

        resultado.setText(resultado.getText().toString() + ocho.getText().toString());
    }

    public void nueve(View view) {

        resultado.setText(resultado.getText().toString() + nueve.getText().toString());
    }

    public void cero(View view) {

        resultado.setText(resultado.getText().toString() + cero.getText().toString());
    }

    public void salir(View view) {

        finishAffinity();
    }
}