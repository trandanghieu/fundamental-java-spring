package com.spring.service;

import com.spring.bean.Item;

import java.util.Arrays;
import java.util.List;

public class ItemServiceImpl implements ItemService {
    @Override
    public List<Item> getAll() {
        return Arrays.asList(new Item(101, "Milk"),
                             new Item(102, "Orange Juice")
        );
    }
    public void init(){
        System.out.println("Do some initialization work");
    }


    public void destroy(){
        System.out.println("Do some cleaning work");
    }
}
