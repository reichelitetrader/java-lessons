package org.piotr.lesson6.files;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClassicTry {

    static final String FILENAME = "liczby.txt";

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(FILENAME)); // Jezeli tu bedzie blad to br dalej jest NULL

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            //br.close();      Ta linijka moze sie nigdy nie wykonac, jesli wczesniej wystapil blad

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
