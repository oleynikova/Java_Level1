package ru.geekbrains.java1.dz.dz7.OleynikovaTanya;

import java.util.Random;

public class MainClass {

    public static void main(String[] args) {

//        Cat cat = new Cat("Barsik", 5);
//        Plate plate = new Plate(100);
//        plate.info();
//        cat.eat(plate);
//        plate.info();

        Random random = new Random(5);

        Plate plate = new Plate(random.nextInt(1000) + 1);
        plate.info();

        final int NUMBER_CAT = 10;
        Cat[] cats = GenerateCat.generateArray(NUMBER_CAT);
        StringBuilder infoCat = new StringBuilder();
        for (int i = 0; i < NUMBER_CAT; i++) {
            Cat currentCat = cats[i];
            currentCat.eat(plate);
            infoCat.append("cat: " + currentCat.getName() + " fullness: " + currentCat.isFullness() + '\n');
        }

        System.out.println();
        System.out.println(infoCat.toString());

        plate.info();
        plate.addFood(100);
        plate.info();
    }

}
