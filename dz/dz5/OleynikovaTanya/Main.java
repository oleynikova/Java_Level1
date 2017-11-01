package ru.geekbrains.java1.dz.dz5.OleynikovaTanya;

public class Main {
    public static void main(String[] args){

        // * Создать массив из 5 сотрудников
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("Ivanov Ivan", "Engineer", "iivanov@mailbox.com", "892312312", 30000, 30);
        staff[1] = new Employee("Petrov Ivan", "Engineer", "ipetrov@gmail.com", "892514513", 60000, 45);
        staff[2] = new Employee("Sidorov Sergey", "Programmer", "ssidorov@yandex.ru", "891933653", 40000, 25);
        staff[3] = new Employee("Kuznecov Aleksey", "Programmer", "akuznecov@gmail.com", "897775277", 80000, 40);
        staff[4] = new Employee("Muhin Mihail", "Architect", "mmuhin@mail.ru", "892578958", 150000, 43);

        // * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (Employee e : staff){
            if (e.getAge() > 40) {
                e.printInfo();
            }
        }
    }
}
