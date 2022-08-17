package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {

        int answer = new Random().nextInt(3);
        System.out.println("Что ты хочешь узнать?");
        String input = new Scanner(System.in).nextLine();

        if (answer == 0) {
            System.out.println(input + " - Да");
        } else if (answer == 1) {
            System.out.println(input + " - Нет");
        } else {
            System.out.println(input + " - Может быть");
        }
    }
}
