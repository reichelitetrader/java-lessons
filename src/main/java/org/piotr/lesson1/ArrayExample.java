package org.piotr.lesson1;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[5];

        System.out.println(array);
        System.out.println(Arrays.toString(array));

        array[0] = 5;
        array[4] = 10;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        Arrays.fill(array, -1);

        System.out.println(Arrays.toString(array));
    }

}
