package edu.homeWork;

public class SmallStorage extends Premises {
    private int Size;
    final private int CELLSIZE = 20;
    private Box box;


    public SmallStorage(int size, String type, int size1, int cellSize, Box box) {
        super(size, type);
        Size = size1;

        this.box = box;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public int getCELLSIZE() {
        return CELLSIZE;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }



    @Override
    public String getType() {
        return null;
    }

    @Override
    public void setType(String type) {

    }
}
