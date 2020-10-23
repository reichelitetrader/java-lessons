package org.piotr.praca_domowa;
import java.util.Scanner;
//Napisz program, który wczyta od użytkownika liczbę całkowitą n.
// Następnie do tablicy n liczb zmiennoprzecinkowych wczyta n liczb typu double podanych
// przez użytkownika. Policz sumę liczb w tablicy i wyświetl wynik na ekranie.
public class CountTotalNumbersInTheArrays {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in); //wczytanie z klawiatury

        System.out.println("Podaj liczbe calkowita");
        int n = scanner.nextInt();
        System.out.println("wczytana liczba to" + n);

        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj liczbe double: ");
            array[i] = scanner.nextDouble();
        }
        System.out.println(sum(array));
    }

    public static double sum(double[] array ) {
        double sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }
}

