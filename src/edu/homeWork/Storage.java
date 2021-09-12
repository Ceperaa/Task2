package edu.homeWork;

public class Storage extends Premises {

    private Place[] box;
    private int totalWeight;

    public Storage() {
    }

    public Storage(int size, Place[] box, int totalWeight) {
        this.box = box;
        this.totalWeight = totalWeight;
    }

    public Place[] getBox() {
        return box;
    }

    public void setBox(Place[] box) {
        this.box = box;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

}
