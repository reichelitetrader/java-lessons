package org.piotr.lekcja3;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        //        "Banany"                  ->     10
        //        "Proszek do pieczenia"    ->      1

        Map<String, Integer> products = new HashMap<>();
        products.put("Banan", 10);
        products.put("Proszek do pieczenia", 1);
        products.put("Jablko", 3);
        products.put("Proszek do pieczenia", 5);

        products.remove("Jablko");

        for (Map.Entry<String, Integer> e : products.entrySet()) {
            System.out.println("Produkt " + e.getKey() +  ", Ilosc: " + e.getValue());
        }

        if (products.containsKey("Banan")) {
            System.out.println("Trzeba kupic banany");
        }

        int sum = 0;
        for (Integer value : products.values()) {
            sum += value;
        }

        System.out.println("Prdukty zajma " + sum + " miejsca");


        String text = "ala ma kota";
        HashMap<Character, Integer> characterMap = new HashMap<>();  //sprawdzanie czestotliwosci wystepowania znaku
        for (char c : text.toCharArray()) {
            if (!characterMap.containsKey(c)) {
                characterMap.put(c, 1);
            } else {
                characterMap.put(c, characterMap.get(c) + 1);
            }
        }

        for (Map.Entry<Character, Integer> e : characterMap.entrySet()) {
            System.out.println("Znak " + e.getKey() + " wystapil " + e.getValue() + " razy.");
        }

    }
}
