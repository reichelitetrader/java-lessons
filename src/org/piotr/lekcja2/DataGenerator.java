package org.piotr.lekcja2;
import java.util.Random;

public class DataGenerator {

    static Random random = new Random();

    public static int[] generateArrayOfInts(int size, int bound) {
        int[] array = new int[size];

        for(int i=0; i<size; i++){
            array[i] = random.nextInt(bound);
        }

        return array;
    }
}
