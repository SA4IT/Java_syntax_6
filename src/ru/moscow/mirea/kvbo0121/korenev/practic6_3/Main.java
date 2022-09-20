package ru.moscow.mirea.kvbo0121.korenev.practic6_3;

public class Main {
    public static void main(String[] args) {
        Nameable a = new Nameable.Get("Fedor");
        System.out.println(a.getName());

        Nameable b = new Nameable.Get("Earth");
        System.out.println(b.getName());
    }
}
