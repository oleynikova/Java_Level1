package ru.geekbrains.java1.lesson3;

public class Primer5 {
    public static boolean sum(int c){
        if (c < 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        sum2(5);
    }

    public static void sum2(int c){
        if (c < 10){
            return;
        }
        System.out.println("dfgdf");
    }
}

