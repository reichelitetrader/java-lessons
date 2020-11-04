package org.piotr.lesson6.files;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("FILES.txt"))){

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
                int a = Integer.valueOf(line);
                values.add(a);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int sum=0;
        for (int number : values){
            sum+= number;
        }
        System.out.println("suma =: " + sum);
    }
}
