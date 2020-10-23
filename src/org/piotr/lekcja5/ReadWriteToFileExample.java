package org.piotr.lekcja5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;
import static java.nio.file.Paths.get;

public class ReadWriteToFileExample {

    public static void main(String[] args) throws IOException {

//        1 sposob
        try (BufferedReader br = newBufferedReader(get("numbers.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        2 sposob
        List<String> numbers = Files.readAllLines(get("numbers.txt"));
        for (String number : numbers) {
            System.out.println(number);
        }

        try (BufferedWriter bw = newBufferedWriter(get("numbers_write.txt"))) {

            for (int i = 0; i < 100; i++) {
                bw.append(String.valueOf(ThreadLocalRandom.current().nextInt()));
                bw.newLine();
            }

            bw.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
