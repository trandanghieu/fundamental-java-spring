package com.spring.service;

public class ClientService {
    private ClientService(){

    }
    private static ClientService clientService;

    public static ClientService getInstance(){
        if(clientService == null){
            return new ClientService();
        }
        return clientService;
    }
    public static void clientInfo(){
        System.out.println("Client Infomation: TDH");
    }
}
