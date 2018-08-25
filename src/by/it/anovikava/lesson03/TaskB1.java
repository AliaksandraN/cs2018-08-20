package by.it.anovikava.lesson03;
/*
Lesson 03. Task B1. Литералы.

Присвойте литерал 111 трём целочисленным переменным
                и 111.111 двум с плавающей запятой,
но при этом исправьте типы данных и литералы так, чтобы числа имели типы
double d - присваивание в десятичном формате,
byte b - присваивание в двоичном формате
long o - присваивание в восьмеричном формате
int h - присваивание в шестнадцатиричном формате
float f - присваивание в десятичном формате

Литералы в коде должны быть записаны как 111 (целые) и 111.111 (с запятой)
с правильными символами типа данных и систем счисления.

Вывод в консоль, написанный в коде, не меняйте. Если не будет ошибок
должно получиться на выходе:
575.2220000610351
111.111 7 73 273 111.111

Для ручной проверки запустите программу Ctrl+Shift+F10
Для автоматической проверки откройте и запустите класс Testing
*/

strictfp class TaskB1 {
    public static  void main(String[] args) {
        double d = 111.111;
        byte b = 0b111;
        long o = 0111;
        int h=0x111;
        float f = 111.111f;
        System.out.println(d + b + o + h + f);
        System.out.println(d + " " + b + " " + o + " " + h + " " + f);
    }
}
