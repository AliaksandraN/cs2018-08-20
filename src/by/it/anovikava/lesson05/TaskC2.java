package by.it.anovikava.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    int a,b,t;
    public static void sort(int[] array) {
        //Напишите тут ваш код
        int t;
        for(int a=1; a < array.length; a++)
            for(int b=array.length-1; b >= a; b--) {
                if(array[b-1] < array[b]) { // if out of order
                    // exchange elements
                    t = array[b-1];
                    array[b-1] = array[b];
                    array[b] = t;
                }
            }
        for(int x : array)
            System.out.print(x+"\n");


    }
    public static void main(String[] args) {
        int[]arr = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 20 чисел: ");
        for (int i = 0; i <20; i++) {
            int value = sc.nextInt();
            arr[i] = value;
        }
        sort(arr);
    }


}
