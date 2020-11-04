package org.piotr.homework;
import java.util.Arrays;
public class CheckTheMiddleValue {
    public static void main(String[] args) {
        int [] array = {2,5,19,11,8,1};
//        1, 2, 5, 8, 11, 19
        System.out.println(median(array));
    }

    public static double median(int[] tab){
        Arrays.sort(tab);

        int middleIndex = tab.length / 2;
        if (tab.length % 2 == 0) {
            return (tab[middleIndex - 1] + tab[middleIndex]) / 2d;
        } else {
            return tab[middleIndex];
        }
    }
}
