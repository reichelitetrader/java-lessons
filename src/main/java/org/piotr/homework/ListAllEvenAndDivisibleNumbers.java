package org.piotr.homework;
import java.util.Scanner;
//Napisz program, który wczyta od użytkownika liczbę całkowitą n.
//wypisze wszystkie liczby parzyste lub podzielne przez 6 w zakresie od n do 10n.
public class ListAllEvenAndDivisibleNumbers {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę calkowita:");
        int n = scanner.nextInt();//pobranie liczby
        System.out.println(n);

        for (int value = n; value < 10*n; value++) {
            if(value % 2 == 0 || value % 6 ==0) {
                System.out.println(value);
            }
        }
    }
}



