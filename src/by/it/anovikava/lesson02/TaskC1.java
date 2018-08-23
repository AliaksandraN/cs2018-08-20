package by.it.anovikava.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите два любых целых числа: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("Sum = " + (number1 + number2));
            }




}
