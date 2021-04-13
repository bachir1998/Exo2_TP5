package com.example.exo2_tp5;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

class MonRecyclerViewAdapter extends RecyclerView.Adapter<MonRecyclerViewAdapter.ConteneurDeDonnee>
{
    private List<Data> data;


    public MonRecyclerViewAdapter(List<Data> data) {
        this.data = data;
    }



    @NonNull
    @Override
    public MonRecyclerViewAdapter.ConteneurDeDonnee onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycleview_item, parent, false);
        return new ConteneurDeDonnee(view);
    }

    @Override
    public void onBindViewHolder(ConteneurDeDonnee conteneur, int position) {
        conteneur.imageView.setImageResource(data.get(position).getImage());
        conteneur.nom.setText(data.get(position).getNom());
        conteneur.taille.setText(data.get(position).getTaille()+"");


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ConteneurDeDonnee extends RecyclerView.ViewHolder{
        TextView nom;
        TextView taille;
        ImageView imageView;

        public ConteneurDeDonnee(View itemView) {
            super(itemView);
             nom= (TextView) itemView.findViewById(R.id.nom);
             taille= (TextView) itemView.findViewById(R.id.taille);
            imageView =  itemView.findViewById(R.id.image);


        }


    }
}
