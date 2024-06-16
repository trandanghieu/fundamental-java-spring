package com.spring.bean;

public class MovieCatalog {
    private final String catalog;

    public MovieCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getCatalog() {
        return catalog;
    }

    public void showMovie() {
        switch (catalog) {
            case "Action":
                System.out.println(">>>Fast and Furious 8");
                break;
            case "Cartoon":
                System.out.println(">>>Tom and Jerry");
                break;
            default:
                System.out.println(">>>Tom and Jerry");
                break;
        }
    }


}
