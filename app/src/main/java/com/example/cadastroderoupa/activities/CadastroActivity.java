package com.example.cadastroderoupa.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cadastroderoupa.R;
import com.example.cadastroderoupa.controller.RoupaDAO;
import com.example.cadastroderoupa.module.Roupa;

public class CadastroActivity extends AppCompatActivity {

    EditText etTipo;
    EditText etCor;
    EditText etTamanho;
    EditText etMarca;
    Button bSalvar;
    RoupaDAO roupaDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        inicializarComponentes();

        roupaDAO = new RoupaDAO();

        bSalvar.setOnClickListener(v -> {
            if(     etTipo.getText().toString().isEmpty() ||
                    etCor.getText().toString().isEmpty() ||
                    etTamanho.getText().toString().isEmpty() ||
                    etMarca.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Roupa roupa = new Roupa(
                        etTipo.getText().toString(),
                        etCor.getText().toString(),
                        etTamanho.getText().toString(),
                        etMarca.getText().toString()
                );

                roupaDAO.addRoupa(roupa);

                Toast.makeText(this, "Roupa Cadastrada", Toast.LENGTH_SHORT).show();

                finish();
            }
        });
    }

    private void inicializarComponentes() {
        etTipo = findViewById(R.id.etTipo);
        etCor = findViewById(R.id.etCor);
        etTamanho = findViewById(R.id.etTamanho);
        etMarca = findViewById(R.id.etMarca);
        bSalvar = findViewById(R.id.bSalvar);
    }
}