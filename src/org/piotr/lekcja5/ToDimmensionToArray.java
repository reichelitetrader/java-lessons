package org.piotr.lekcja5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ToDimmensionToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ilosc wierszy: ");
        int rows = scanner.nextInt();
        System.out.println("Podaj ilosc kolumn: ");
        int cols = scanner.nextInt();

        int [][] array = new int[rows][cols];

        for(int i =0; i< array.length;i++){
            for( int j=0; j< array[0].length;j++){
                array[i][j] = ThreadLocalRandom.current().nextInt(10);
            }
        }

        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get("numbers1.txt"))) {

            for(int i =0; i< array.length; i++){

                bw.append(String.valueOf(array[i][0]));
                for(int j=1; j< array[0].length;j++){
                    bw.append(" ").append(String.valueOf(array[i][j]));
                }

                if (i < array.length-1) {
                    bw.newLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
