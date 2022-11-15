package com.example.actividadlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Calculadora extends AppCompatActivity {

    TextView resultado;
    TextInputEditText operando1;
    TextInputEditText operando2;
    int res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        resultado = findViewById(R.id.textResTotal);
        operando1 = findViewById(R.id.textOperando1);
        operando2 = findViewById(R.id.textOperando2);
    }

    public void Sumar(View view) {

        res = Integer.parseInt(operando1.getText().toString()) + Integer.parseInt(operando2.getText().toString());

        resultado.setText(String.valueOf(res));
    }

    public void Restar(View view) {

        res = Integer.parseInt(operando1.getText().toString()) - Integer.parseInt(operando2.getText().toString());

        resultado.setText(String.valueOf(res));
    }

    public void Multiplicar(View view) {

        res = Integer.parseInt(operando1.getText().toString()) * Integer.parseInt(operando2.getText().toString());

        resultado.setText(String.valueOf(res));
    }

    public void Dividir(View view) {

        res = Integer.parseInt(operando1.getText().toString()) / Integer.parseInt(operando2.getText().toString());

        resultado.setText(String.valueOf(res));
    }
}