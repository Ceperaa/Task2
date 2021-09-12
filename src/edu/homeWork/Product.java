package edu.homeWork;

public class Product {
    private String name;
    private int id;
    private int weight;

    public Product(String name, int id, int amount) {
        this.name = name;
        this.id = id;
        this.weight = amount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
