package com.example.actividadlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Linear_RadioButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_checkbox);
    }

    public void mensaje1(View view) {

        Toast.makeText(getApplicationContext(), "Favoritos", Toast.LENGTH_SHORT).show();
    }

    public void mensaje2(View view) {

        Toast.makeText(getApplicationContext(), "Micrófono activado", Toast.LENGTH_SHORT).show();
    }


    public void mensaje3(View view) {

        Toast.makeText(getApplicationContext(), "Bloqueo activado", Toast.LENGTH_SHORT).show();
    }

    public void goToRelative(View view) {

        Intent i = new Intent(getApplicationContext(), Relative.class);
        startActivity(i);
    }
}