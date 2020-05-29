package com.example.jorgeramos_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {
    RadioButton res1,res2;
    CheckBox c1,c2,c3;
    Button finalizar;
    EditText pregunta1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        finalizar = findViewById(R.id.btnFinalizarEncuesta);
        res1 = findViewById(R.id.rbSi);
        res2 = findViewById(R.id.rbNo);
        c1 = findViewById(R.id.cbFutbol);
        c2 = findViewById(R.id.cbBasquet);
        c3 = findViewById(R.id.cbTenis);
        pregunta1 = findViewById(R.id.edtPregunta1);
    }

    public void continuar(View v){
        Intent encus = new Intent(Encuesta.this, Resumen.class);
        if(c1.isChecked()==true)
        {
            encus.putExtra("pregunta1",c1.getText().toString());
        }
        if (c2.isChecked()==true)
        {
            encus.putExtra("pregunta11",c2.getText().toString());
        }
        if (c3.isChecked()==true)
        {
            encus.putExtra("pregunta12",c3.getText().toString());
        }
        if (res1.isChecked()==true)
        {
            encus.putExtra("pregunta2",res1.getText().toString());
        }
        if (res2.isChecked()==true)
        {
            encus.putExtra("pregunta21",res2.getText().toString());
        }


        Toast.makeText(getApplicationContext(),"ENCUESTA GENERADA", Toast.LENGTH_SHORT).show();
        startActivity(encus);

    }
}
