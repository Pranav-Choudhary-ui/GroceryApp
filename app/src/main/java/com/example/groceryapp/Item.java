package com.example.groceryapp;

public class Item {

    String item_title;
    String description;
    int image;

    public Item(String item_title, String description, int image) {
        this.item_title = item_title;
        this.description = description;
        this.image = image;
    }

    public String getItem_title() {
        return item_title;
    }

    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
