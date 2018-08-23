package by.it.anovikava.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите два любых целых числа: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int S = number1 + number2;

        for (int i = 0; i < 4; i++) {

            System.out.println("DEC:" + number1 + "+" + number2 + "=" + (number1 + number2));
            System.out.println("BIN:" + Integer.toBinaryString(number1) + "+" + Integer.toBinaryString(number2) + "=" + (Integer.toBinaryString(S)));
            System.out.println("HEX:" + Integer.toHexString(number1) + "+" + Integer.toHexString(number2) + "=" + (Integer.toHexString(S)));
            System.out.println("OCT:" + Integer.toOctalString(number1) + "+" + Integer.toOctalString(number2) + "=" + (Integer.toOctalString(S)));

        }

    }
}
