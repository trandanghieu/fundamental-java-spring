package com.diamonstore.model;

import jakarta.validation.constraints.*;

public class Item {
    @NotNull(message = "Name canot be null")
    @Size(min = 3, max = 9, message = "A")
    private String itemId;

    @NotNull(message = "Name canot be null")
    @Size(min = 3, max = 9, message = "B")
    private String name;


    public Item() {
    }

    public Item(String itemId, String name) {
        this.itemId = itemId;
        this.name = name;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
