package ru.geekbrains.java1.lesson3;

public class Primer4 {
    public static void main(String[] arg){
        print("dfdf", "dfgdfg", "rrr");
        print("4");
        print("1", "2", "3", "4", "5");
    }

    private static void print(String... s){
        for (String item : s){
            System.out.println(item);
        }
    }
}
