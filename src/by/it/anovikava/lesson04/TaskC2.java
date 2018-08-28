package by.it.anovikava.lesson04;

import java.time.LocalDate;
import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите день и месяц: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        //LocalDate a = LocalDate.of(2018, month, day); это метод нахождения дня года
        // System.out.println(a.getDayOfYear());
        int[ ] dy = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};

        int res=0;

        for (int i = 0; i < month-1; i++) {
            res += dy[i];

        }
        System.out.println(res+day);

    }
    }


