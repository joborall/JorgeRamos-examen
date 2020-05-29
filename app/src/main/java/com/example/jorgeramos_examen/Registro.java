package com.example.jorgeramos_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {
    Button botonG = null;
    Button botonC = null;
    TextView mensaje = null;
    TextView userLogged = null;
    Bundle datos;
    EditText nombre= null;
    EditText monto= null;
    TextView cuota= null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        userLogged = (TextView)findViewById(R.id.txtUConectado);
        botonG = findViewById(R.id.btnGuardar);
        botonC= findViewById(R.id.btnCalcCuota);
        nombre = findViewById(R.id.edtNombre);
        monto = findViewById(R.id.edtMonto);
        cuota = findViewById(R.id.txtCuota);

        /*** Mostramos el dato recibido*/
        datos = getIntent().getExtras();
        String usuarioLogeado = datos.getString("userLoggedIn");
        userLogged.setText("Usuario conectado " + usuarioLogeado);
    }

    public void calcularCuota(View v){

        Double saldo = 0.00;
        Double saldoImpuesto = 0.00;
        Double cuotaFinal = 0.00;
        Double valorTotal = 1800.00;

        Double dmonto = Double.parseDouble(monto.getText().toString());

        if(dmonto<=valorTotal && dmonto>0){
            saldo = valorTotal - dmonto;
            saldoImpuesto = saldo + saldo * 0.05;
            cuotaFinal = saldoImpuesto / 3;
            cuota.setText("" + cuotaFinal);
        }else{
            cuota.setText("El Monto inicial debe ser mayor que 0 y menor o igual a: "+ valorTotal);
        }

    }
}
