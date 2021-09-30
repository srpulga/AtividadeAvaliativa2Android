package com.example.cadastroderoupa.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cadastroderoupa.R;
import com.example.cadastroderoupa.controller.RoupaDAO;
import com.example.cadastroderoupa.module.Roupa;

public class RoupaAdapter extends RecyclerView.Adapter {

    private Context context;
    private RoupaDAO roupaDAO;

    public RoupaAdapter(Context context, RoupaDAO roupaDAO) {
        this.context = context;
        this.roupaDAO = roupaDAO;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View viewRoupa = LayoutInflater.from(context).inflate(R.layout.layout_roupa, viewGroup, false);

        RoupaViewHolder roupaViewHolder = new RoupaViewHolder(viewRoupa);

        return  roupaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        RoupaViewHolder roupaViewHolder = (RoupaViewHolder) viewHolder;

        Roupa r = roupaDAO.getRoupa(i);

        roupaViewHolder.tvTipo.setText("Tipo " + r.getTipo());
        roupaViewHolder.tvCor.setText("Cor: " +r.getCor());
        roupaViewHolder.tvTamanho.setText("Tamanho: " + r.getTamanho());
        roupaViewHolder.tvMarca.setText("Marca: " + r.getMarca());
    }

    @Override
    public int getItemCount() {
        return roupaDAO.getListaRoupas().size();
    }
}
