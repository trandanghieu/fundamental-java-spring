package com.jdbc.service;

import com.jdbc.dao.ItemGroupDAO;
import com.jdbc.dao.ItemGroupDAOImpl;
import com.jdbc.entity.ItemGroup;
import com.jdbc.entity.ItemGroupDTO;

import java.util.List;

public class ItemGroupServiceImpl implements ItemGroupService {
    private ItemGroupDAO itemGroupDAO;
    public ItemGroupServiceImpl(){
        itemGroupDAO = new ItemGroupDAOImpl();
    }

    @Override
    public List<ItemGroup> get(String name) {
        return itemGroupDAO.get(name);
    }

    @Override
    public boolean saveOrUpdate(ItemGroup itemGroup) {
        return itemGroupDAO.saveOrUpdate(itemGroup);
    }

    @Override
    public boolean update(ItemGroup itemGroup) {
        return itemGroupDAO.update(itemGroup);
    }

    @Override
    public boolean save(ItemGroup itemGroup) {
        return itemGroupDAO.save(itemGroup);
    }

    @Override
    public List<ItemGroup> getAll() {
        return itemGroupDAO.getAll();
    }

    @Override
    public ItemGroup get(int id) {
        return itemGroupDAO.get(id);
    }

    @Override
    public List<ItemGroupDTO> getItemsByItemGroupId() {
        return itemGroupDAO.getItemsByItemGroupId();
    }
}
