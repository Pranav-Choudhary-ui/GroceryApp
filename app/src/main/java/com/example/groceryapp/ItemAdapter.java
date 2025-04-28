package com.example.groceryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder>{

    List<Item> itemList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item item = itemList.get(position);

        holder.title.setText(item.getItem_title());
        holder.desc.setText(item.getDescription());
        holder.imgView.setImageResource(item.getImage());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public ItemAdapter(List<Item> itemArrayList) {
        this.itemList = itemArrayList;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imgView;
        TextView title;
        TextView desc;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.item_img);
            title = itemView.findViewById(R.id.item_title);
            desc = itemView.findViewById(R.id.item_desc);

        }
    }
}

