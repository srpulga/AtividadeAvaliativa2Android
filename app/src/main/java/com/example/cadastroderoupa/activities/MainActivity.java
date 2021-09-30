package com.example.cadastroderoupa.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.cadastroderoupa.R;
import com.example.cadastroderoupa.adapter.RoupaAdapter;
import com.example.cadastroderoupa.controller.RoupaDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabAdd;
    RecyclerView rvRoupas;
    RoupaDAO roupaDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarComponentes();

        roupaDAO = new RoupaDAO();

        fabAdd.setOnClickListener(v -> {
            startActivity(new Intent(this, CadastroActivity.class));
        });

        RecyclerView.LayoutManager meuLayout = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );

          rvRoupas.setLayoutManager(meuLayout);
    }

    @Override
    protected void onResume() {
        super.onResume();

        RoupaAdapter meuAdapter = new RoupaAdapter(this, roupaDAO);

        rvRoupas.setAdapter(meuAdapter);
    }

    private void inicializarComponentes() {
        fabAdd = findViewById(R.id.fabAdd);
        rvRoupas = findViewById(R.id.rvRoupas);
    }
}