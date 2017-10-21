package ru.geekbrains.java1.lesson3;

import java.util.Scanner;

public class Primer1 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        do {
            System.out.println("Введите число < 20 & > 1:");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
            }

        } while (!(b < 20 && b > 1));
        System.out.println("Введенное число: " + b);

//        scanner.nextLine();
//        scanner.next();
    }
}
