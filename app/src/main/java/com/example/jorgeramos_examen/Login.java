package com.example.jorgeramos_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button ingresar = null;
    EditText loginU = null;
    EditText passwordU = null;
    TextView saludos = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ingresar = findViewById(R.id.btnIngresar);
        loginU = findViewById(R.id.edtUser);
        passwordU = findViewById(R.id.edtPass);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (loginU.getText().toString().equals("estudiante2020") && passwordU.getText().toString().equals("uisrael2020")) {
                    Intent intent = new Intent(view.getContext(), Registro.class);
                    intent.putExtra("userLoggedIn", loginU.getText().toString());
                    Toast.makeText(getApplicationContext(),"Bienvenido" +loginU.getText(),Toast.LENGTH_LONG).show();
                    startActivity(intent);
                } else
                    Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void onClickBoton (View v){
        saludos.setText(""+ loginU.getText());
    }
}
