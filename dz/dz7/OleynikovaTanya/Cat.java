package ru.geekbrains.java1.dz.dz7.OleynikovaTanya;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }
    public void eat(Plate p) {

        int remain = p.getFood();
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            fullness = true;
            System.out.printf("Кот %s поел %d%n", name, appetite);
        } else {
            System.out.printf("В тарелке недостаточно еды для кота %s. Осталось - %d, а нужно - %d%n", name, remain, appetite);
        }

    }

    public void infoFullness() {
        System.out.println("cat: " + name + " fullness: " + fullness);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFullness() {
        return fullness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (appetite != cat.appetite) return false;
        if (fullness != cat.fullness) return false;
        return name != null ? name.equals(cat.name) : cat.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + appetite;
        result = 31 * result + (fullness ? 1 : 0);
        return result;
    }
}
