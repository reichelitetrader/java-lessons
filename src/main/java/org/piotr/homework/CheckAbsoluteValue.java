package org.piotr.homework;
import java.util.Scanner;

public class CheckAbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ujemną: ");
        int n = scanner.nextInt();
        int absN = absolute(n);
        System.out.println("Wartość bezwzględna z " + n + "wynosi " + absN);
    }

    public static int absolute(int n){
//        if(n> 0){
//            return n;
//        }else {
//            return -n;
//        }
        return n > 0 ? n : -n;
    }
}




