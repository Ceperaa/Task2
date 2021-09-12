package edu.homeWork;

public class Main {

    public static void main(String[] args) {

        Storekeeper storekeeper = new Storekeeper();
        Storage storage = new Storage();
        storage.setSize(20);
        storage = storekeeper.acceptanceOfGoods(storage.getSize());

        for (Place place : storage.getBox()) {
            System.out.println(place.getId() +
                    " " + place.getProduct().getName() +
                    ", вес - " + place.getProduct().getWeight());
        }
    }
}
