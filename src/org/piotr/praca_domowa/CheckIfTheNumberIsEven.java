package org.piotr.praca_domowa;
import java.util.Scanner;
//- sprawdz parzystosc liczby
public class CheckIfTheNumberIsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int number = scanner.nextInt();
        if (isEven(number)) {
            System.out.println("Podana liczba jest parzysta");
        } else {
            System.out.println("Podana liczba jest nieparzysta");
        }
    }

    public static boolean isEven(int n ){
        return n % 2 == 0;
    }
}



