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

    private List<Item> itemList;

    public ItemClickListener clickListener;

//    public ItemAdapter(List<Item> itemList, ItemClickListener clickListener) {
//        this.itemList = itemList;
//        this.clickListener = clickListener;
//    }

    public void setClickListener(ItemClickListener myListener){
        this.clickListener = myListener;
    }
    public ItemAdapter(List<Item> itemArrayList) {
        this.itemList = itemArrayList;
    }



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


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgView;
        TextView title;
        TextView desc;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.item_img);
            title = itemView.findViewById(R.id.item_title);
            desc = itemView.findViewById(R.id.item_desc);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(clickListener != null){
                clickListener.onClick(v,getAdapterPosition());
            }
        }
    }
}

