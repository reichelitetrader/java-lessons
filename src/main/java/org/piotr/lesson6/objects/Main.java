package org.piotr.lesson6.objects;
import java.math.BigDecimal;

public class Main {

    public static final String TEXT = "costam";

    public static void main(String[] args) {
        Person person = new Person("Adam", "Jackowski", 50, "12312312311");
        System.out.printf("FullName: %s\n", person.getFullName());
        System.out.println(person.getPesel());   // ma byc dozwolony
//        person.setPesel("99999999999");         // ma byc niedozwolony

        Order order = new Order(person, new BigDecimal("1499.99"), Order.Status.ACCEPTED);
        System.out.println(order);

        order.updateStatus(Order.Status.PROCESSING);
//        %s -> String, %d -> int / Integer, %f -> double / Double / float / Float ,%b -> boolean / Boolean
    }
}
