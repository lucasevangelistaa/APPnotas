package com.example.notas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_calculate).setOnClickListener(view -> {
            calcularMedia();
        });
    }

    private void calcularMedia() {
        EditText nota1Campo = findViewById(R.id.et_grade1);
        EditText nota2Campo = findViewById(R.id.et_grade2);
        EditText nota3Campo = findViewById(R.id.et_grade3);
        EditText nota4Campo = findViewById(R.id.et_grade4);
        TextView resultadoTexto = findViewById(R.id.tv_result);

        try {
            double nota1 = Double.parseDouble(nota1Campo.getText().toString());
            double nota2 = Double.parseDouble(nota2Campo.getText().toString());
            double nota3 = Double.parseDouble(nota3Campo.getText().toString());
            double nota4 = Double.parseDouble(nota4Campo.getText().toString());

            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media >= 7) {
                resultadoTexto.setText("Aprovado! Média: " + media);
            } else {
                resultadoTexto.setText("Reprovado. Média: " + media);
            }
        } catch (NumberFormatException e) {
            resultadoTexto.setText("Por favor, insira todas as notas corretamente.");
        }
    }
}
