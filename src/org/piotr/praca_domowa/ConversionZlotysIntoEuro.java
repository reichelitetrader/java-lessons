package org.piotr.praca_domowa;

public class ConversionZlotysIntoEuro {
    public static void main(String[] args) {
        System.out.println(convertZlotysToEuro(1000));
    }

    public static double convertZlotysToEuro(double zlotys){
        return zlotys/4.47;
    }

    public static double convertZlotysToEuro2(double zlotys, double rate){
        return zlotys/rate;
    }
}

