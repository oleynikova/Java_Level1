package ru.geekbrains.java1.dz.dz7.OleynikovaTanya;

import java.util.Random;

public class GenerateCat {

    static final String[] name = {"Barsik", "Murzik", "Lily", "Vasya", "Kuzya", "Molly", "Kitty", "Fedor", "Lord"};

    public static Cat generate(){

        Random random = new Random();
        int indexName = random.nextInt(name.length - 1);
        return new Cat(name[indexName], random.nextInt(300));
    }

    public static Cat[] generateArray(int count){

        Cat[] cats = new Cat[count];
        for(int i = 0; i < count; i++){
            cats[i] = generate();
        }

        return cats;
    }

}
