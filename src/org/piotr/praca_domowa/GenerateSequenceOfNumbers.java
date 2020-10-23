package org.piotr.praca_domowa;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
//program który dla zadanego n - liczba całkowita wygeneruje n-znakowy ciąg liczb
public class GenerateSequenceOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("wczytaj n: ");
        int n = scanner.nextInt();
//        Random random = new Random();
//        int randomNumber = 100 + random.nextInt(100);
//        int randomNumber2 = ThreadLocalRandom.current().nextInt(100, 200);
//        System.out.println(randomNumber);
//        System.out.println(randomNumber2);

        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int num = ThreadLocalRandom.current().nextInt(0, 10);// [0; 10) => [0; 9]
            sb.append(num);
        }
        System.out.println("Wygenerowany ciag cyfr: " + sb.toString());
    }
}
