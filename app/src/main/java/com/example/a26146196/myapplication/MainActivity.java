package com.example.a26146196.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText altura;
    private RadioGroup sexo;
    private TextView txtResultado;
    double peso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        altura = findViewById(R.id.altura);
        sexo = findViewById(R.id.sexo);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void calcularPeso(View v){
        double Altura = Double.parseDouble(altura.getText().toString());

        int Sexo = sexo.getCheckedRadioButtonId();

        if (Sexo == R.id.masculino) {
            peso = (72.7 * Altura) - 58;
        }else {
           peso = (62.1 * Altura) - 58;
        }
        txtResultado.setText("seu peso ideal é:" + peso);

    }
}
