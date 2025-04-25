package com.example.groceryapp;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<>{

    ArrayList<Item> itemArrayList;
    Context context;

    public ItemAdapter(ArrayList<Item> itemArrayList, Context context) {
        super(context, R.layout.item_layout, itemArrayList);
        this.itemArrayList = itemArrayList;
        this.context = context;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

