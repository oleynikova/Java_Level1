package ru.geekbrains.java1.lesson5;

public class Main {

    public static void main(String[] args) {

        String s = "string";

        Car lada = new Car();
        lada.setName("Lada samara");
        lada.setColor("red");
        lada.setNomer(7);
        lada.printInfo();
        lada.drive();

        Car volvo = new Car("Volvo V60", "green", 13);
        volvo.printInfo();
        volvo.drive();
    }
}
