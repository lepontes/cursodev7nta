package com.example.a26146196.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Questao4 extends AppCompatActivity {

    private Spinner operadora;
    private EditText tempo;
    private TextView textResultado;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4);

        operadora = findViewById(R.id.operadora);
        tempo = findViewById(R.id.tempo);
        textResultado = findViewById(R.id.textResultado);

    }
    public void calcularPreco(View v) {
        String itemEscolhido = operadora.getSelectedItem().toString();

        double Tempo = Double.parseDouble(tempo.getText().toString());

        if (itemEscolhido.equals("OP1")) {
            resultado = (Tempo * 1.2);
        }else if (itemEscolhido.equals("OP2")) {
            resultado = (Tempo * 1.5);
        }else if (itemEscolhido.equals("OP3")) {
            resultado = (Tempo * 1.14);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Selecione uma Operadora", Toast.LENGTH_LONG);
            toast.show();

        }

        textResultado.setText("valor da ligação r$"+ resultado);
    }
}
