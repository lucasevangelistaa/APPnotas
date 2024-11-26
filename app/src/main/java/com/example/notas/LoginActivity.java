package com.example.notas;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btn_login).setOnClickListener(view -> {
            iniciarTelaPrincipal();
        });

        findViewById(R.id.btn_register).setOnClickListener(view -> {
            iniciarTelaCadastro();
        });
    }

    private void iniciarTelaPrincipal() {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    private void iniciarTelaCadastro() {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
    }
}
