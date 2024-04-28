package com.jdbc.dao;

import com.jdbc.entity.Item;

import java.time.LocalDate;
import java.util.List;

public interface ItemDAO {
    List<Item> get(String igName);
    List<Item> get(LocalDate orderDate);

}
