package com.spring.view;

import com.spring.bean.Item;
import com.spring.service.ClientService;
import com.spring.service.ItemService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        String[] beans = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beans));

        Item item = context.getBean("item", Item.class);
        System.out.println(item);

        ClientService clientService = context.getBean("clientService", ClientService.class);

        clientService.clientInfo();

        ItemService itemService = context.getBean("itemService", ItemService.class);
        context.close();



    }
}
