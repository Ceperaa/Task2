package edu.homeWork;

import java.util.Random;

public class Storekeeper implements LoadingUnloading {

    @Override
    public Storage acceptanceOfGoods(int sizeStore) {
        Place[] places = addPriduct(sizeStore);
        Storage storage = new Storage(sizeStore, places, TotalWeight(places));
        System.out.println("Общий вес - " + storage.getTotalWeight());

        return storage;
    }

    @Override
    public Product product(int id) {
        String[] types = {"Бытовая техника", "Професиональная техника", "Хоз.товары", "Запчасти"};
        Product product = new Product(types[new Random().nextInt(types.length)],
                id,
                new Random().nextInt(10));
        return product;
    }

    public Place[] addPriduct(int cargo) {
        Place[] places = new Place[cargo];
        for (int i = 0; i < cargo; i++) {
            int id = i + 1;
            places[i] = new Place(id, product(id));
        }
        return places;
    }

    public int TotalWeight(Place[] places) {
        int totalWeight = 0;

        for (int i = 0; i < places.length; i++) {
            int sum = places[i].getProduct().getWeight();
            totalWeight = totalWeight + sum;
        }
        return totalWeight;
    }
}
