package com.example.groceryapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Item> itemList;
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);
        itemList = new ArrayList<>();
        Item item1 = new Item("Fruits","Fresh Fruits from the Garden",R.drawable.fruit);
        Item item2 = new Item( "Vegetables","Delicious Vegetables ",R.drawable.vegitables);
        Item item3 = new Item("Bakery","Bread, Wheat and Beans",R.drawable.bread);
        Item item4 = new Item( "Beverage","Juice, Tea, Coffee and Soda",R.drawable.beverage);
        Item item5 = new Item( "Milk", "Milk, Shakes and Yogurt",R.drawable.milk);
        Item item6 = new Item("Snacks","Pop Corn, Donut and Drinks",R.drawable.popcorn);


        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

//        RecyclerView recyclerView = findViewById(R.id.recyclerView);
//        if (recyclerView != null) {
//            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//            recyclerView.setLayoutManager(layoutManager);
//        }


        itemAdapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);
    }
}