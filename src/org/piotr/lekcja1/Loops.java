package org.piotr.lekcja1;

public class Loops {

    public static void main(String[] args) {
        int k = 10;

//        dodawanie 1 do k
        k = k + 1;
        k += 1;
        k++;
//        dodawanie 1 do k

        for(int i=0; i<1001; i+=2){
            System.out.println(i);
        }

        int i = 0;
        while(i<1001){
            System.out.println(i);
            i+=2;
        }

        i = 0;
        do {
            System.out.println(i);
            i+=2;
        } while (i < 1001);

        String str = "Ala ma kota";
        for (int j = 0; j < str.length(); j++) {
            System.out.println(str.charAt(j));
        }

        for (char c : str.toCharArray()) {
            System.out.print(c + ", ");
        }
    }

}
