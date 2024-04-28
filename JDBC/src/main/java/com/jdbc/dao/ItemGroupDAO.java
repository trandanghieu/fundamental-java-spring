package com.jdbc.dao;

import com.jdbc.entity.ItemGroup;
import com.jdbc.entity.ItemGroupDTO;

import java.util.List;

public interface ItemGroupDAO {
    List<ItemGroup> getAll();
    ItemGroup get(int id);

    List<ItemGroup> get(String name);

    boolean save(ItemGroup itemGroup);// insert
    boolean update(ItemGroup itemGroup);// update
    boolean saveOrUpdate(ItemGroup itemGroup);// update

    List<ItemGroupDTO> getItemsByItemGroupId();



}
