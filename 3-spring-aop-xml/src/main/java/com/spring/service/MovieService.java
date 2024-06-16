package com.spring.service;

//Join Point Class
public class MovieService {
    private String name;
    private int catalog;

    public void setName(String name) {
        this.name = name;
    }

    public void setCatalog(int catalog) {
        this.catalog = catalog;
    }
    public void printName(){
        System.out.println("Moive Service printName>>" + name);
    }

    public int printCatalog(){
        System.out.println("Catalog value" + catalog);
        return catalog;
    }

}
