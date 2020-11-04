package org.piotr.lesson4;
import java.util.Set;

public class Main {
    public static int max(int[] array){
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if( array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static double avg(Set<Integer> numbers){
        double sum=0;
        for(int i : numbers){
            sum += i;
        }
        return sum/numbers.size();
    }
}
