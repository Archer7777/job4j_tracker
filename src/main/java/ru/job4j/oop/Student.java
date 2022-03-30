package ru.job4j.oop;

public class Student {

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public void bayan() {
        System.out.println("играет на баяне");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.bayan();
        petya.bayan();
        petya.bayan();
        petya.song();
        petya.song();
        petya.song();
    }
}
