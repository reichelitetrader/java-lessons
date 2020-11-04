package org.piotr.lesson2;

import java.util.HashSet;
import java.util.Set;

public class Exe1 {
    public static void main(String[] args) {
        int[] tab = DataGenerator.generateArrayOfInts(10000, 10000);

        Set<Integer> set = new HashSet<>();  //elementy bez powtorzen
        for(int i=0;i<tab.length;i++){
            if(isPerfect(tab[i])){
                set.add(tab[i]);
            }
        }

        System.out.println(set);
    }

    public static boolean isPerfect(int number){
        int sum = 0;
        for(int i=1;i<=number/2;i++){
            if(number % i ==0){
                sum += i;
            }
        }
        return number == sum;
    }

}
