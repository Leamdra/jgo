package com.example.jogo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false )
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.Resultado.setText(position);
        holder.moeda.setImageResource(R.id.imageMoeda);

    }

    @Override
    public int getItemCount() {

        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView Resultado;
        ImageView moeda;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Resultado = itemView.findViewById(R.id.textResultado);
            moeda = itemView.findViewById(R.id.imageMoeda);
        }
    }
}
