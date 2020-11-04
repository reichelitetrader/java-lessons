package org.piotr.lesson7;

public class Main {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber("123456789");
        System.out.println(phoneNumber.getValue());
        System.out.println(phoneNumber.getPolishNumber());
    }
}
