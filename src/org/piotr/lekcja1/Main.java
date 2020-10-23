package org.piotr.lekcja1;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[3];

        System.out.println("WCZYTAJ LICZBE A:");
        array[0] = scanner.nextInt();

        System.out.println("WCZYTAJ LICZBE B:");
        array[1] = scanner.nextInt();

        System.out.println("WCZYTAJ LICZBE C:");
        array[2] = scanner.nextInt();

        System.out.println(Arrays.toString(array));

        int sum = sum(array);
        double avg = avg(array);

        System.out.println("Suma = " + sum);
        System.out.println("srednia =" + avg);
        System.out.printf("%.2f", avg);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int number : array) {
//            sum = sum + array[i];
            sum += number;
        }

        return sum;
    }

    public static double avg(int[] array) {
        return (double) sum(array) / array.length;
    }
}
