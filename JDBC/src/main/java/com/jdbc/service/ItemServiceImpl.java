package com.jdbc.service;

import com.jdbc.dao.ItemDAO;
import com.jdbc.dao.ItemDAOImpl;
import com.jdbc.entity.Item;

import java.time.LocalDate;
import java.util.List;

public class ItemServiceImpl  implements ItemService{

    private ItemDAO itemDao;
    public  ItemServiceImpl(){
        itemDao = new ItemDAOImpl();
    }
    @Override
    public List<Item> get(String igName) {
        return itemDao.get(igName);
    }

    @Override
    public List<Item> get(LocalDate orderDate) {
        return itemDao.get(orderDate);
    }
}
