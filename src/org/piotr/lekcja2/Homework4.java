package org.piotr.lekcja2;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe");
        int number = scanner.nextInt();
        int sum=0;

        for(int i=1;i<=number/2;i++){
            if(number % i ==0){
              sum += i;
            }
        }
        if(number == sum){
            System.out.println("liczba jest doskonala:" + number);
        } else {
            System.out.println("nie jest doskonala");
        }

    }
}
