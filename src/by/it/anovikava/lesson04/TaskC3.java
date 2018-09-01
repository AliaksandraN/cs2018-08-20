package by.it.anovikava.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

import java.util.Locale;

/*public class TaskC3 {
    static String print(int i) {
        if (i <= 19)
            switch (i) {
                case 0:
                    return "";
                case 1:
                    return "один";
                case 2:
                    return "два";
                case 3:
                    return "три";
                case 4:
                    return "четыре";
                case 5:
                    return "пять";
                case 6:
                    return "шесть";
                case 7:
                    return "семь";
                case 8:
                    return "восемь";
                case 9:
                    return "девять";
                case 10:
                    return "десять";
                case 11:
                    return "одиннадцать";
                case 12:
                    return "двеннадцать";
                case 13:
                    return "тринадцать";
                case 14:
                    return "четырнадцать";
                case 15:
                    return "пятнадцать";
                case 16:
                    return "шестнадцать";
                case 17:
                    return "семнадцать";
                case 18:
                    return "восемнадцать";
                case 19:
                    return "девятнаддцать";
                default:
                    break;

            }
         else {
            int d = i / 10;
            switch (d) {
                case 2:
                    return "двадцать";
                case 3:
                    return "тридцать";
                case 4:
                    return "сорок";
                case 5:
                    return "пятьдесят";
                case 6:
                    return "шестьдесят";
                case 7:
                    return "семьдесят";
                case 8:
                    return "восемьдесят";
                case 9:
                    return "девяноста";
                case 10:
                    return "сто";
            }
        }
    }

       

    public static void main(String[] args) {
        for (int i = 2; i <= 10 ; i++) {
            String end;
            if (i % 10 == 0)
                end = " ";
            else end = " " + print(i % 10);
            for (int j = 2; j <= 10 ; j++) {
                System.out.println(print(i)+ " умножить на " + print(j) + " равно " + print(i*j)+"end");

            }

        }

    }
}*/

        /*String[ ] a = new String[] {"один","два","три","четыре","пять","шесть","семь","восемь","девять","десять"};
        //String[ ] b = new String[] {"один","два","три","четыре","пять","шесть","семь","восемь","девять","десять"};

        for (int i = 1; i <= 10; i++){
           // int j = 1;
           // while (j <= 10) {
                //if (j > 10) break;
            for (int j = 1; j < 10; j++)
                System.out.println(a[i] + " умножить на " + b[j] + " равно " + (i+1)*(j+1));

                //j++;
            }
            //System.out.println();
           // i++;

        }*/





