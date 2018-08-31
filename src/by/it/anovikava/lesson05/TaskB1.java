package by.it.anovikava.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Scanner;



public class TaskB1 {
    public static void main(String args[]) {
        ArrayList <String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("FOUR");
        list.add("FIVE");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите 5 строк: ");
//        for (int i = 0; i < 5; i++) {
//            String line = sc.nextLine();
//            list.add(line + "\n");
//        }

        System.out.println(list.size());
        for (int j = 0; j < 5; j++) {
            System.out.println(list.get(j));
        }

    }

}
