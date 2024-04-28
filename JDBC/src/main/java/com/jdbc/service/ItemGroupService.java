package com.jdbc.service;

import com.jdbc.entity.ItemGroup;
import com.jdbc.entity.ItemGroupDTO;

import java.util.List;

public interface ItemGroupService {
    List<ItemGroup> getAll();
    ItemGroup get(int id);
    List<ItemGroup> get(String name);

    boolean save(ItemGroup itemGroup);
    boolean update(ItemGroup itemGroup);
    boolean saveOrUpdate(ItemGroup itemGroup);
    List<ItemGroupDTO> getItemsByItemGroupId();


}
