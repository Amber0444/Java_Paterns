package com.example.MarketPlace;

public class Product {
    private long id;
    private String title;
    private String description;
    private int Price;
    private String author;
    private String type; 
    
    private Product(Long id, String title, String description, String author, int Price, String type)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.Price = Price;
        this.type = type;
    }

    public static Product getItemProduct(Long id, String title, String description, String author, int Price){
        return new Product(id, title, description, author, Price, "Item");
    }

    public static Product getItemService(Long id, String title, String description, String author, int Price){
        return new Product(id, title, description, author, Price, "Service");
    }

    public Product copy(){
        Product copy = new Product(id + 1, title, description, author, Price, type);
        return copy;
    }

}
