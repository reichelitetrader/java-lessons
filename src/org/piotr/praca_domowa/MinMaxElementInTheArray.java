package org.piotr.praca_domowa;

public class MinMaxElementInTheArray {

    public static int max( int[] array){
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if( array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array){
        int min = array[1];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
