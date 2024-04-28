package com.jdbc.view;

import com.jdbc.service.ItemGroupService;
import com.jdbc.service.ItemGroupServiceImpl;
import com.jdbc.service.ItemService;
import com.jdbc.service.ItemServiceImpl;

import java.time.LocalDate;
import java.time.Month;

public class App {
    private static ItemGroupService itemGroupService;
    private static ItemService itemService;

    static {
        itemGroupService = new ItemGroupServiceImpl();
        itemService = new ItemServiceImpl();
    }

    public static void main(String[] args) {
        // List<ItemGroup> groupList = itemGroupService.getAll();
        //SqlUtils.print(groupList);
        //System.out.println(itemGroupService.get(2));
        //System.out.println(itemGroupService.save(new ItemGroup(100,"Áo dài")));
        //System.out.println(itemGroupService.saveOrUpdate(new ItemGroup(100,"Áo ngắn")));
        //System.out.println(itemGroupService.get("Áo"));
        // System.out.println(itemService.get("Áo"));
        //System.out.println(itemService.get(LocalDate.of(2020,Month.DECEMBER,18)));
        System.out.println(itemGroupService.getItemsByItemGroupId());

    }
}
