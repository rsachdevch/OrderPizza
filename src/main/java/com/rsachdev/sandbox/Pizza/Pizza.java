package com.rsachdev.sandbox.Pizza;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Pizzas")
public class Pizza {
    @Id
    private String id;
    private String name;

    public Pizza() {
    }

    public Pizza(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
