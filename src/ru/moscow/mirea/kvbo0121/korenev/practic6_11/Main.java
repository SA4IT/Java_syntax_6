package ru.moscow.mirea.kvbo0121.korenev.practic6_11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Convertable a = new Convertable.Temperature();
        System.out.println("Введите температуру по Цельсию:");
        Scanner sc = new Scanner(System.in);
        double celsius_in = sc.nextDouble();
        a.setCelsius(celsius_in);
        a.convert();
        a.celsius();
        a.kelvin();
        a.fahrenheit();
    }
}
