package edu.homeWork;

public class Box {
    private int id;
    private int size;

    public Box(int id, int size) {
        this.id = id;
        this.size = size;
    }
    public Box() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
