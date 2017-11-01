package ru.geekbrains.java1.dz.dz5.OleynikovaTanya;

public class Employee {

    //* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    private String fullName;
    private String post;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    //* Конструктор класса должен заполнять эти поля при создании объекта;
    public Employee(String fullName, String post, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    // * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    public void printInfo(){
        System.out.printf("Полное имя: %s, должность: %s, email: %s, телефон: %s, зарплата: %d, возраст: %d%n", fullName, post, email, telephone, salary, age);
    }

    public int getAge() {
        return age;
    }
}
