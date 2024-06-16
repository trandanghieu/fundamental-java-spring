package com.spring.bean;

public class MovieCatalog {
    private final String catalog;


    public MovieCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getCatalog() {
        return catalog;
    }


    public void showMovie( ){
        switch (catalog) {
            case "ACTION":
                System.out.println(">>>Fast and Furious 8"); break;
            case "CARTOON":
                System.out.println(">>>Tom and Jerry"); break;
            default: System.out.println(">>>Tom and Jerry"); break;

        }

    }

}
