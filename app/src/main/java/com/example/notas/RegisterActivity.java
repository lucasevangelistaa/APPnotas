package com.example.notas;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        findViewById(R.id.btn_save).setOnClickListener(view -> {
            salvarUsuario();
        });
    }

    private void salvarUsuario() {
        startActivity(new Intent(RegisterActivity.this, MainActivity.class));
    }
}
