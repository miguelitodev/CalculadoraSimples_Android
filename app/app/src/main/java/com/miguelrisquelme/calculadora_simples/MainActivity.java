package com.miguelrisquelme.calculadora_simples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void Somar(View v){
            EditText txtPrimeiroValor = findViewById(R.id.txtPrimeiroValor);
            EditText txtSegundoValor = findViewById(R.id.txtSegundoValor);
            TextView txtResultado = findViewById(R.id.txtResultado);

            float valor1 = Float.parseFloat(txtPrimeiroValor.getText().toString());
            float valor2 = Float.parseFloat(txtSegundoValor.getText().toString());

            float resultado = valor1 + valor2;

            txtResultado.setText(String.valueOf(resultado));
        }

        public void Subtrair(View v){
            EditText txtPrimeiroValor = findViewById(R.id.txtPrimeiroValor);
            EditText txtSegundoValor = findViewById(R.id.txtSegundoValor);
            TextView txtResultado = findViewById(R.id.txtResultado);

            float valor1 = Float.parseFloat(txtPrimeiroValor.getText().toString());
            float valor2 = Float.parseFloat(txtSegundoValor.getText().toString());

            float resultado = valor1 - valor2;

            txtResultado.setText(String.valueOf(resultado));
        }

        public void Dividir(View v){
            EditText txtPrimeiroValor = findViewById(R.id.txtPrimeiroValor);
            EditText txtSegundoValor =  findViewById(R.id.txtSegundoValor);
            TextView txtResultado = findViewById(R.id.txtResultado);

            float valor1 = Float.parseFloat(txtPrimeiroValor.getText().toString());
            float valor2 = Float.parseFloat(txtSegundoValor.getText().toString());

            float resultado = valor1 / valor2;

            txtResultado.setText(String.valueOf(resultado));
        }

        public void Multiplicar(View v){
            EditText txtPrimeiroValor = findViewById(R.id.txtPrimeiroValor);
            EditText txtSegundoValor = findViewById(R.id.txtSegundoValor);
            TextView txtResultado = findViewById(R.id.txtResultado);

            float valor1 = Float.parseFloat(txtPrimeiroValor.getText().toString());
            float valor2 = Float.parseFloat(txtSegundoValor.getText().toString());

            float resultado = valor1 * valor2;

            txtResultado.setText(String.valueOf(resultado));
        }

    }
}
