package org.piotr.praca_domowa;
import java.util.Scanner;

public class CheckPrimeNumber {

    public static boolean isPrime(int number) {
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int number = scanner.nextInt();

        if (CheckPrimeNumber.isPrime(number)) {
            System.out.println("Liczba jest pierwsza: ");
        } else {
            System.out.println("Liczba nie jest pierwsza");
        }
    }
}

