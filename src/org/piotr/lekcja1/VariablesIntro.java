package org.piotr.lekcja1;

public class VariablesIntro {

    public static void main(String[] args) {
        int i = 10; // typ całkowity

        Integer i2 = 10;
        System.out.println(i2.toString());

        short s = 100;
        float f = 5.123123123123123123f;
        Float f2;

        double d = 5.123123123123123123;
        Double d2;

        System.out.println("Float" + f);
        System.out.println("Double" + d);

        byte b = 1;
        String str = "Ala ma kota";
        System.out.println("Czy " + str + " zawiera 'kota': " + str.contains("kota"));

        boolean bool = true;

        char c = 'a';
        System.out.println((char) (c+2));
        System.out.println((int) c);

        int number = 6;
        if(number % 2 == 0){
            System.out.println("Liczba parzysta");
        } else {
            System.out.println("Liczba nieparzysta");
        }

        if(number % 2 == 0 && number % 3 == 0) {
            System.out.println("Liczba podzielna przez 2 i przez 3");
        } else {
            System.out.println("Liczba niepodzielna przez 2 i przez 3");
        }
    }

}
