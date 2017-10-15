package ru.geekbrains.java1.dz.dz1.OleynikovaTanya;

public class Main {

    public static void main(String[] args) {

        // task 2
        byte bt = -128;
        short sht = -32768;
        int i = -2147483648;
        long lg = -9223372036854775808L;
        float flt = -128.0f;
        double dbl = 14.2333;
        boolean bln = true;
        char chr = 'c';

        // task 3
        int a, b, c, d;
        a = 10;
        b = 3;
        c = 5;
        d = 2;
        System.out.print("a = " + a + "; b = " + b + "; c = " + c + "; d = " + d);
        System.out.println("; a * (b + (c / d)) = " + task3(a, b, c, d));

        // task 4
        byte nmb1 = -4;
        byte nmb2 = 10;
        boolean result4 = task4(nmb1, nmb2);

        System.out.print("Сумма чисел " + nmb1  + " и " + nmb2 + " в пределах от 10 до 20 (включительно) ");
        System.out.println((result4)? "лежит": "не лежит");

        // task 5
        task5(-7);

        // task 7
        task7("Tanya");

        // task 8
        task8(2020);
    }

    // Метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    public static int task3(int a, int b, int c, int d){

        return a * (b + (c / d));
    }

    // Метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
    // пределах от 10 до 20(включительно), если да – возвращается true, в противном случае – false
    public static boolean task4(int number1, int number2) {

        int sum = number1 + number2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Метод печатает в консоль положительное ли число передали, или отрицательное
    // Замечание: ноль - положительное число
    public static void task5(int number) {

        System.out.print("Число " + number);
        if (task6(number) == false) {
            System.out.println(" - положительное");
        } else {
            System.out.println(" - отрицательное");
        }
    }

    // Метод возвращает true, если переданное число отрицательное
    public static boolean task6(int number) {

       if (number < 0) {
           return true;
        } else {
           return false;
        }
    }
    // Метод выводит в консоль сообщение; "Привет, %указанное_имя!"
    public static void task7(String name) {

        System.out.println("Привет, " + name + "!");

    }

    // Метод определяет является год високосным и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void task8(int year) {

        System.out.print("Год " + year);
        if ((year % 4) == 0 && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.print(" является високосным");
        } else {
            System.out.print(" не является високосным");
        }
    }

}
