package edu.homeWork;

public class BigStorage extends Premises {

    final private int CELLSIZE = 20;
    private int cellSize = 100;
    private Box box;


    public BigStorage(int size, String type, int cellSize, Box box) {
        super(size, type);
        this.cellSize = cellSize;
        this.box = box;
    }

    public int getCELLSIZE() {
        return CELLSIZE;
    }

    public int getCellSize() {
        return cellSize;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public BigStorage(int size, String type) {
        super(size, type);
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void setSize(int size) {

    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void setType(String type) {

    }
}