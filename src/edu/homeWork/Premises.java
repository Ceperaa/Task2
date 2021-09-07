package edu.homeWork;

public abstract class  Premises {
    private int size;
    private String type;

    public Premises(int size, String type) {
        this.size = size;
        this.type = type;
    }
    public abstract int getSize();

    public abstract void setSize(int size);

    public abstract String getType();

    public abstract void setType(String type);

}
