package org.piotr.praca_domowa;

import java.util.Scanner;

//Dla zadanego n, wczytanego od użytkownika wyświetl na ekran wszystkie całowite dzielniki liczby n.
public class Homework3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wczytaj liczbe n: ");
        int n = scanner.nextInt();

        for(int i=1;i<=n/2;i++){
            if(n % i == 0){
                System.out.println("dzielnik:"+ i);

            }
        }

        System.out.println("dzielnik:"+ n);
    }
}
