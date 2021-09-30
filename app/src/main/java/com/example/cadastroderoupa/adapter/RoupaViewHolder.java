package com.example.cadastroderoupa.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cadastroderoupa.R;

public class RoupaViewHolder extends RecyclerView.ViewHolder {

    TextView tvTipo;
    TextView tvCor;
    TextView tvTamanho;
    TextView tvMarca;

    public RoupaViewHolder(@NonNull View itemView) {
        super(itemView);
        inicializarComponentes();
    }

    public void inicializarComponentes(){
        tvTipo = itemView.findViewById(R.id.tvTipo);
        tvCor = itemView.findViewById(R.id.tvCor);
        tvTamanho = itemView.findViewById(R.id.tvTamanho);
        tvMarca = itemView.findViewById(R.id.tvMarca);
    }
}
