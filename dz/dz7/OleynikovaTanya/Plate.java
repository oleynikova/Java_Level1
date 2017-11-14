package ru.geekbrains.java1.dz.dz7.OleynikovaTanya;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void addFood(int n) {
        food += n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plate)) return false;

        Plate plate = (Plate) o;

        return food == plate.food;
    }

    @Override
    public int hashCode() {
        return food;
    }
}
