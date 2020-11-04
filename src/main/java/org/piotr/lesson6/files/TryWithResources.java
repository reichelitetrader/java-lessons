package org.piotr.lesson6.files;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    static final String FILENAME = "liczby.txt";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
