package org.piotr.lekcja5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.Files.newBufferedWriter;
import static java.nio.file.Paths.get;

public class FileToTwoDimensionalArray {

    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Paths.get("numbers1.txt"));

//        String s = "7 0 1 5 1 2 6 0";
//        System.out.println(Arrays.toString(s.split(" ")));

        String firstRow = list.get(0);
        int cols = firstRow.split(" ").length;
        int rows = list.size();

        int [][] array = new int[rows][cols];

        for(int i=0; i<list.size();i++){
            String[] strings = list.get(i).split(" ");
            for (int j = 0; j < cols; j++) {
                array[i][j] = Integer.parseInt(strings[j]);
            }
        }

        for(int i=0; i< array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = sum(array);
        int valuesLessThan10 = countLessTen(array);

        System.out.println(sum);
        System.out.println(valuesLessThan10);

        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get("numbers1_wyniki.txt"))) {

            bw.append("Suma: ").append(String.valueOf(sum));
            bw.newLine();
            bw.append("Wartosci mniejsze od 10: ").append(String.valueOf(valuesLessThan10));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int sum(int[][] array) {
        int sum=0;
        for(int i=0;i< array.length;i++){
            for(int j=0; j< array.length;j++){
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static int countLessTen(int[][] array){
        int counter = 0;
        for(int i=0;i< array.length;i++){
            for(int j=0; j< array.length;j++){
                if(array[i][j]<10){
                    counter ++;
                }
            }
        }
        return counter;
    }


}
