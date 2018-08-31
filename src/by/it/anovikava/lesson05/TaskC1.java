package by.it.anovikava.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {




private static void printList(List<Integer> list) {
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();
    ArrayList<Integer> c = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            if ((list.get(i) % 3 == 0) && (list.get(i) % 2 == 0)) {
                a.add(list.get(i));
                b.add(list.get(i));
            } else {
                if (list.get(i) % 3 == 0) a.add(list.get(i));
                else if (list.get(i) % 2 == 0) b.add(list.get(i));
                else c.add(list.get(i));
            }


        }
    for (Integer aList : a)
    System.out.print(aList+"\n");
    for (Integer aList : b)
    System.out.print(aList+"\n");
    for (Integer aList : c)
    System.out.print(aList+"\n");
}
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 20 целых чисел: ");

        for (int i = 0; i < 20; i++) {
            int el = sc.nextInt();
            list.add(el);

        }


        printList(list);

            }



    }




