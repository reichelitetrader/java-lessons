package org.piotr.lesson1;

import java.util.Scanner;

public class ScannerExample {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj imie: ");
        String name = scanner.next();

        System.out.println("Podaj nazwisko: ");
        String surname = scanner.next();

        String fullName = name + " " + surname;
        System.out.println("Imie i nazwisko: " + fullName);

        System.out.println("podaj wiek: ");
        int age = scanner.nextInt();

        if(age>18 && age<40){
            System.out.println("miesci sie w zakresie : ");
        }
    }

}
