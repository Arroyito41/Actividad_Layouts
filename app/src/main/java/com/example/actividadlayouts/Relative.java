package com.example.actividadlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Relative extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
    }

    public void table(View view) {

        Intent i = new Intent(getApplicationContext(), Table.class);
        startActivity(i);
    }

    public void toastC(View view) {

        Toast.makeText(getApplicationContext(), "C", Toast.LENGTH_SHORT).show();
    }

    public void toastO(View view) {

        Toast.makeText(getApplicationContext(), "O", Toast.LENGTH_SHORT).show();
    }

    public void toastE(View view) {

        Toast.makeText(getApplicationContext(), "E", Toast.LENGTH_SHORT).show();
    }

    public void toastS(View view) {

        Toast.makeText(getApplicationContext(), "S", Toast.LENGTH_SHORT).show();
    }

    public void toastN(View view) {

        Toast.makeText(getApplicationContext(), "N", Toast.LENGTH_SHORT).show();
    }

    public void toastNo(View view) {

        Toast.makeText(getApplicationContext(), "NO", Toast.LENGTH_SHORT).show();
    }

    public void toastSo(View view) {

        Toast.makeText(getApplicationContext(), "SO", Toast.LENGTH_SHORT).show();
    }

    public void toastNe(View view) {

        Toast.makeText(getApplicationContext(), "NE", Toast.LENGTH_SHORT).show();
    }

    public void toastSe(View view) {

        Toast.makeText(getApplicationContext(), "SE", Toast.LENGTH_SHORT).show();
    }
}