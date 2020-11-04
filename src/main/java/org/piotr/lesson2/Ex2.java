package org.piotr.lesson2;
import java.util.*;

public class Ex2 {

    public static void main(String[] args) {
        int[] ints = DataGenerator.generateArrayOfInts(100, 500);
        System.out.println(Arrays.toString(ints));

        int searchValue = 10;
        for (int i : ints) {
            if (i == searchValue) {
                System.out.println("Znaleziono");
                break;
            }
        }

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<ints.length;i++){
            set.add(ints[i]);
        }
        System.out.println(set);

        if (set.contains(10)) {                 // 1 operacja aby znalezc liczbe
            System.out.println("Set zawiera 10");
        }

        System.out.println("Rozmiar tablicy: " + ints.length);
        System.out.println("Rozmiar set'u: " + set.size());

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<ints.length;i++){
            list.add(ints[i]);
        }

        System.out.println("Rozmiar listy: " + list.size());
        System.out.println(list);

        if (list.contains(10)) {                // n operacji aby znalezc liczbe (n - rozmiar listy)
            System.out.println("lista zawiera 10");
        }
    }

}
