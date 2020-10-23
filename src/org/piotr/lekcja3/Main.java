package org.piotr.lekcja3;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static final int PHONE_NUMBER_LENGTH = 9;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<100;i++){
            list.add(getPhoneNumber());
        }
        System.out.println(list);

        List<String> twelves = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).startsWith("12")) {
                twelves.add(list.get(i));
            }
        }
        System.out.println("Tyle razy wystapil numer z 12 na poczatku:" + twelves.size());
        System.out.println("Numery: " + twelves);

        //n=0;  //zerowanie
        List<String> endswith77 = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).endsWith("77")){
              endswith77.add(list.get(i));
            }
        }
        System.out.println("Tyle razy wystawilo na koncu 77:" + endswith77.size());
        System.out.println("Numery: " + endswith77);

        Set<String> set = new HashSet<>();  // ilosc duplikatow nie przechowuje
        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        System.out.println("rozmiar setu:" + set.size());

        HashMap<Character,Integer> mapNumber = new HashMap<>();
        for(int i=0;i<list.size();i++){
            String number = list.get(i);
            for(int j=0; j<number.length(); j++ ) {
                char character = number.charAt(j);
                if(!mapNumber.containsKey(character)){
                    mapNumber.put(character, 1);
                } else {
                    mapNumber.put(character, mapNumber.get(character) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> e : mapNumber.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    public static String getPhoneNumber(){
        StringBuilder sb = new StringBuilder(PHONE_NUMBER_LENGTH);
        for(int i=0;i<PHONE_NUMBER_LENGTH;i++){
            int number = ThreadLocalRandom.current().nextInt(10); //nie tworzymy nowego obiektu
            sb.append(number);    //dodawanie do stringbuildera kolejnych znakow
        }
        return sb.toString();
    }
}
